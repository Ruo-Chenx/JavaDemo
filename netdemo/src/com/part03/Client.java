package com.part03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception{

     Socket soc=new Socket(InetAddress.getLocalHost(),8888);
     
     
     PrintStream ps=new PrintStream(soc.getOutputStream());
     BufferedReader br=new BufferedReader(new InputStreamReader(soc.getInputStream()));
     
     new KeyThread(ps).start();
     new ReadOther("Server:", br).start();
	}

}
