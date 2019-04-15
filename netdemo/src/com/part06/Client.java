package com.part06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class Client {

	public static void main(String[] args) throws Exception{
		 DatagramSocket ds=new DatagramSocket();
		 
		 String str="´ó¼ÒºÃ";
		 byte[]data=str.getBytes();
		 InetAddress ip=InetAddress.getByName("192.168.0.10");
		 
		 DatagramPacket dp=new DatagramPacket(data, data.length, ip, 8888);
		 
		 
		 ds.send(dp);

	}

}
