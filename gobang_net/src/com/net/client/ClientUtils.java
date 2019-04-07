package com.net.client;

import java.util.LinkedList;

import com.net.util.Message;

import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;

public class ClientUtils 
{
   private static ChannelHandlerContext cx=null;
   private static   Channel channel;
   private static LinkedList<Message> MSGQUE=new LinkedList<Message>();

   
   public static void push(Message msg)
   {
	   MSGQUE.addFirst(msg);
   }
   public static Message pop()
   {
	   if(MSGQUE.size()>0)
		   return MSGQUE.removeLast();
	   else
		   return new Message();
   }
public static void sendMsg(byte type,byte[]body)
   {
	   Message msg=new Message(type, body.length, body);
	   if(null!=channel&&channel.isOpen())
	   {
		   channel.writeAndFlush(msg);
	   }else
	   {
		   System.out.println("发送信息失败");
		  // Client client=new Client(8888,"127.0.0.1");
		  // client.start(); 
	   }
   }



public static Channel getChannel() {
	return channel;
}


public static void setChannel(Channel channel) {
	ClientUtils.channel = channel;
}

}
