package com.part03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args)throws Exception
	{
		//�����ʵ���˷������׽��֡�
		ServerSocket server=new ServerSocket(8888);
		System.out.println("����������...");
		Socket s=server.accept();//java.net.ServerSocket.accept()����Ҫ���ӵ����׽��ֲ���������	
		new KeyThread(new PrintStream(s.getOutputStream())).start();	
		BufferedReader br = new BufferedReader(new InputStreamReader(s.getInputStream()));	
		new ReadOther("Client", br).start();		
	}
	
}
