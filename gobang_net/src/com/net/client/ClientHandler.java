package com.net.client;

import com.net.util.Message;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
 /*       String m = "你好啊,Netty。昂昂";
        Message msg = new Message((byte)0xCA,4,new byte[]{1,5,6,8});
        ctx.writeAndFlush(msg);
        */
        
       // Message msg1 = new Message((byte)0xCA,4,new byte[]{2,3,9,8});
       // ctx.writeAndFlush(msg1);
    }

	@Override
	public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
		  
		Message ms=(Message)msg;
		
		//System.out.println(ms.getType()+","+ms.getLength()+","+new String(ms.getMsgBody()));
		ClientUtils.push(ms);
	}
    
    
}