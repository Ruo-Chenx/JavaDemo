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
		System.out.println("服务器已起动。。。。");
		
		Socket  s=server.accept();//阻塞  等客户的到来
		 System.out.println("客户机连上了。。。。。");
		 
		 InputStream is=s.getInputStream();
		 OutputStream os=s.getOutputStream();
		 
		 BufferedReader br=new BufferedReader(new InputStreamReader(is));
		 String str=null;
		 while(null!=(str=br.readLine()))
		 {
			 System.out.println("客户机说："+str);
		 }
		 
		 System.out.println("end........");

	}

}
