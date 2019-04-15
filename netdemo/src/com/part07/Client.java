package com.part07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
	int port=8888;
	DatagramSocket ds=null;
	DatagramPacket send=null;//发
	DatagramPacket recieve=null;//收
	byte [] buffer=new byte[512];
	private BufferedReader br=null;
	private InetAddress ip=null;
	public Client()
	{
		try {
			ip=InetAddress.getByName("192.168.0.10");
			ds=new DatagramSocket();
			recieve=new DatagramPacket(buffer, buffer.length);
			byte[] hand="hand".getBytes();
			send=new DatagramPacket(hand, hand.length, ip, port);
			ds.send(send);
			
			//读对方发来的数据
				new Thread(new Runnable() {
					
					@Override
					public void run() {
					    
						try {
							while(true)
							{
							ds.receive(recieve);
							
							System.out.println("Server:"+new String(recieve.getData()));
							}
						} catch (IOException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
						
					}
				}).start();
				
				
			//读键盘
				String str=null;
				br=new BufferedReader(new InputStreamReader(System.in));
				while(null!=(str=br.readLine()))
				{
					//写给客户端
					byte[]tem=str.getBytes();
					send=new DatagramPacket(tem, tem.length, ip,port);
					ds.send(send);//发给客户端
				}
				
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          new Client();
	}

}
