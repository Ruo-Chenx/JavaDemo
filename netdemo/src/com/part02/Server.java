package com.part02;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws Exception
	{
		ServerSocket server=new ServerSocket(8888);
		System.out.println("���������𶯡�������");
		
		Socket  s=server.accept();//����  �ȿͻ��ĵ���
		 System.out.println("�ͻ��������ˡ���������");
		 
		 InputStream is=s.getInputStream();
		 OutputStream os=s.getOutputStream();
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(is));
		 String str=null;
		 while(null!=(str=br.readLine()))
		 {
			 System.out.println("�ͻ���˵��"+str);
		 }
		 
		 System.out.println("end........");

	}

}
