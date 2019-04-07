package com.net.server;

import java.net.InetSocketAddress;

import com.net.util.MessageEncoder;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;

public class Server 
{
    private static final int MAX_FRAME_LENGTH = 1024 * 1024;//数据包最大长度
    private static final int LENGTH_FIELD_LENGTH = 4;//长度字段
    private static final int LENGTH_FIELD_OFFSET = 1;//偏移几个后才是长度字段
    //该字段加长度字段等于数据帧的长度，一般数据帧长度都是这样定义(即我们在设置Message中的length属性)，加入你的消息体是20位，再加上
    private static final int LENGTH_ADJUSTMENT = 0;
    private static final int INITIAL_BYTES_TO_STRIP = 0;

    private int port;

    public Server(int port) {
        this.port = port;
    }

    public void start(){
        EventLoopGroup bossGroup = new NioEventLoopGroup(1);
        EventLoopGroup workerGroup = new NioEventLoopGroup();
        try {
            ServerBootstrap sbs = new ServerBootstrap()
                    .group(bossGroup,workerGroup)
                    .channel(NioServerSocketChannel.class)
                    .localAddress(new InetSocketAddress(port))
                    .childHandler(new ChannelInitializer<SocketChannel>(){

						@Override
						protected void initChannel(SocketChannel sc) throws Exception
						{
						ChannelPipeline pipeline = sc.pipeline();

						 pipeline.addLast(new MessageDecoder(MAX_FRAME_LENGTH,LENGTH_FIELD_LENGTH,LENGTH_FIELD_OFFSET,LENGTH_ADJUSTMENT,INITIAL_BYTES_TO_STRIP,false));
						   pipeline.addLast(new MessageEncoder());
						 // 自己的逻辑Handler
						 pipeline.addLast("handler", new ServerHandler());
						}
                    	
                    })
                    .option(ChannelOption.SO_BACKLOG, 128)
                    .childOption(ChannelOption.SO_KEEPALIVE, true);

            ChannelFuture future = sbs.bind(port).sync();

            System.out.println("Server start listen at " + port );
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }
    }

    public static void main(String[] args) {
        Server server = new Server(8888);
        server.start();
    }

}