package com.net.server;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.net.util.Message;

import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class ServerHandler extends SimpleChannelInboundHandler<Object> {

	//放用户信息
	public static Map<String,ChannelHandlerContext> map=new HashMap<String,ChannelHandlerContext>();
    public static String black;//黑方  第一个为头相，第二个为名字
    public static String white;//白方
	@Override
    protected void channelRead0(ChannelHandlerContext ctx, Object o) throws Exception {
        if(o instanceof Message) {
        	Message msg = (Message)o;
           System.out.println("收到消息。。。"+msg.getType()+"-->"+new String(msg.getMsgBody()));
           if(msg.getType()==Message.CHAT)
           {
        	   Iterator<String> it=map.keySet().iterator();
	           	while(it.hasNext())
	           	{
	           		ChannelHandlerContext   tem=map.get(it.next());
	           		tem.writeAndFlush(msg);
	           	}
           }
            if(msg.getType()==Message.REQ)
            {
            	//请求连接
            	
            	if(map.size()==0)
            	{ 
            		black=new String(msg.getMsgBody());//fist
            		map.put(black, ctx);
            		byte[] data="YES".getBytes();
            		ctx.writeAndFlush(new Message(Message.BLACK,data.length,data));
            	}else if(map.size()==1)
            	{
            		byte[] dd="YES".getBytes();
            		ctx.writeAndFlush(new Message(Message.WHITE,dd.length,dd));
            		
            		//开始
            		Iterator<String> it=map.keySet().iterator();
            		String key=it.next();
            		ChannelHandlerContext  first=map.get(key);
            		
            		byte[] data0=black.getBytes();
            		
            		white=new String(msg.getMsgBody());
            		map.put(white, ctx);
            		byte[] data=white.getBytes();
            		
            		
            		first.writeAndFlush(new Message(Message.READEY,data.length,data));
            		
            		ctx.writeAndFlush(new Message(Message.READEY,data0.length,data0));
            	}
            	else if(map.size()>=2)
            	{
            		byte[] data="NO".getBytes();
            		ctx.writeAndFlush(new Message(Message.NO,data.length,data));
            	}
            	
            	
            }
            if(msg.getType()==Message.ROWCOL||msg.getType()==Message.WIN)
            {
            	Iterator<String> it=map.keySet().iterator();
            	while(it.hasNext())
            	{
            		ChannelHandlerContext   tem=map.get(it.next());
            		tem.writeAndFlush(msg);
            	}
            }
            
        	/*
        	for(ChannelHandlerContext ctx:list)
        	{
        		System.out.println("*****>"+ctx);
        		byte []data="大家好".getBytes();
        		ctx.writeAndFlush(new Message((byte)2,data.length , data));
        	}
        	*/
        	
            
        }
    }
}