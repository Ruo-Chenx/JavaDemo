package com.part07;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;

public class Server
{
	int port=8888;
	DatagramSocket ds=null;
	DatagramPacket send=null;//发
	DatagramPacket recieve=null;//收
	byte [] buffer=new byte[512];
	private BufferedReader br=null;
	
	SocketAddress  sa=null;//封装了端口和ip
	
	public Server()
	{
		try {
			ds=new DatagramSocket(port);
			System.out.println("start server....");
			recieve=new DatagramPacket(buffer, buffer.length);
		 //先收客户端的一个包
			ds.receive(recieve);
			sa=recieve.getSocketAddress();
			System.out.println("收到客户端的一个包:"+new String(recieve.getData())+recieve.getAddress()+recieve.getPort());
			
		//读对方发来的数据
			new Thread(new Runnable() {
				
				@Override
				public void run() {
				    
					try {
						while(true)
						{
						ds.receive(recieve);
						
						System.out.println("client:"+new String(recieve.getData()));
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
				send=new DatagramPacket(tem, tem.length, sa);
				ds.send(send);//发给客户端
			}
			
		
		
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) 
	{
	    new Server();
	}

}
