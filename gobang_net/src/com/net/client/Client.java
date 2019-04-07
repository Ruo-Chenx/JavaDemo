package com.net.client;

import com.net.util.MessageDecoder;
import com.net.util.MessageEncoder;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;

public class Client extends Thread {
	private static final int MAX_FRAME_LENGTH = 1024 * 1024;//数据包最大长度
	private static final int LENGTH_FIELD_LENGTH = 4;//长度字段
	private static final int LENGTH_FIELD_OFFSET = 1;//偏移几个后才是长度字段
	private static final int LENGTH_ADJUSTMENT = 0;//调整
	private static final int INITIAL_BYTES_TO_STRIP = 0;//薄离
	
    private  int port;
    private  String address;
    private Channel channel;
    
    public Client(int port,String address) {
        this.port = port;
        this.address = address;
    }

    
    public void run(){
        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.group(group)
                .channel(NioSocketChannel.class)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChannelInitializer<SocketChannel>(){

					@Override
					protected void initChannel(SocketChannel sc) throws Exception
					{
						ChannelPipeline pipeline = sc.pipeline();
						 pipeline.addLast(new MessageDecoder(MAX_FRAME_LENGTH,LENGTH_FIELD_LENGTH,LENGTH_FIELD_OFFSET,LENGTH_ADJUSTMENT,INITIAL_BYTES_TO_STRIP,false));
				        pipeline.addLast(new MessageEncoder());
				        pipeline.addLast(new ClientHandler());
					}
                	
                });

        try {
            ChannelFuture future = bootstrap.connect(address,port).sync();
            channel=future.channel();
            ClientUtils.setChannel(channel);//设置Channel
            future.channel().closeFuture().sync();
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            group.shutdownGracefully();
        }
    }

   
    
    public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}

	public static void main(String[] args) {
        //Client client = new Client(7788,"127.0.0.1");
       // client.start();
    }
}