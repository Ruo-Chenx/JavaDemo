package com.net.util;

public class Message {
	
	//消息类型
	public static final byte EMPTY=0;//空包
	public static final byte REQ=1;//请求登录
	public static final byte RESP=2;
	public static final byte YES=3;//准许连上
	public static final byte NO=4;//不准许
	public static final byte BLACK=5;//开始白子
	public static final byte WHITE=6;//开始黑子
	public static final byte ROWCOL=7;//下的子
	public static final byte CHAT=8;//对话
	public static final byte READEY=9;//开始
	public static final byte WIN=10;//赢棋
	
    //消息类型
    private byte type;

    //消息长度
    private int length;

    //消息体
    private byte[] msgBody;

    public Message()
    {
    	this(Message.EMPTY,"EMPTY".length(),"EMPTY".getBytes());
    }
    public Message(byte type, int length, byte[] msgBody) {
        this.type = type;
        this.length = length;
        this.msgBody = msgBody;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

	public byte[] getMsgBody() {
		return msgBody;
	}

	public void setMsgBody(byte[] msgBody) {
		this.msgBody = msgBody;
	}

 
}