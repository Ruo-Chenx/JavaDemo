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
	DatagramPacket send=null;//��
	DatagramPacket recieve=null;//��
	byte [] buffer=new byte[512];
	private BufferedReader br=null;
	
	SocketAddress  sa=null;//��װ�˶˿ں�ip
	
	public Server()
	{
		try {
			ds=new DatagramSocket(port);
			System.out.println("start server....");
			recieve=new DatagramPacket(buffer, buffer.length);
		 //���տͻ��˵�һ����
			ds.receive(recieve);
			sa=recieve.getSocketAddress();
			System.out.println("�յ��ͻ��˵�һ����:"+new String(recieve.getData())+recieve.getAddress()+recieve.getPort());
			
		//���Է�����������
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
			
			
		//������
			String str=null;
			br=new BufferedReader(new InputStreamReader(System.in));
			while(null!=(str=br.readLine()))
			{
				//д���ͻ���
				byte[]tem=str.getBytes();
				send=new DatagramPacket(tem, tem.length, sa);
				ds.send(send);//�����ͻ���
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
