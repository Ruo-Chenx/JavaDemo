package com.part02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args)throws Exception 
	{
		InetAddress ip=InetAddress.getByName("192.168.0.10");
		Socket s=new Socket(ip, 8888);
		
		PrintStream ps=new PrintStream(s.getOutputStream());
		
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=null;
		while(null!=(str=br.readLine()))
		{
			ps.println(str);
		}

		
		System.out.println("client end...");
	}

}
