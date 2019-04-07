package com.net.util;

import java.nio.charset.Charset;

import com.net.util.Message;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

public class MessageEncoder extends MessageToByteEncoder<Message> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Message message, ByteBuf byteBuf) throws Exception {
        if(message == null){
            throw new Exception("未获得消息内容");
        }


    
        byteBuf.writeByte(message.getType());//先写一个字节
        byteBuf.writeByte(message.getLength());//长度4字节
        byteBuf.writeBytes(message.getMsgBody());//数据


    }
}