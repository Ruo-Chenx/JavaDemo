package com.part06;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
//����������
public class Server {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub

		  DatagramSocket ds=new DatagramSocket(8888);
		  System.out.println("����������........");
		  byte [] data=new byte[512];
		  //���������ݵİ�
		  DatagramPacket  dp=new DatagramPacket(data, data.length);
		  
		  ds.receive(dp);//���� ��û���������Ļ���������ִ��
		  
		  System.out.println("�յ�������---"+dp.getLength()+"---"+new String(data,0,dp.getLength()));
		  
	}

}
