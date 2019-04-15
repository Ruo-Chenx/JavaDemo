package com.part03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws Exception
	{
		//这个类实现了服务器套接字。
		ServerSocket server=new ServerSocket(8888);
		System.out.println("服务器启动...");
		Socket s=server.accept();//java.net.ServerSocket.accept()侦听要连接到此套接字并接受它。	
		new KeyThread(new PrintStream(s.getOutputStream())).start();	
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));	
		new ReadOther("Client", br).start();		
	}
	
}
