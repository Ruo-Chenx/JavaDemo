package com.part06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
//用于收数据
public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		  DatagramSocket ds=new DatagramSocket(8888);
		  System.out.println("服务器启动........");
		  byte [] data=new byte[512];
		  //用于收数据的包
		  DatagramPacket  dp=new DatagramPacket(data, data.length);
		  
		  ds.receive(dp);//阻塞 ，没有数据来的话，不往下执行
		  
		  System.out.println("收到了数据---"+dp.getLength()+"---"+new String(data,0,dp.getLength()));
		  
	}

}
