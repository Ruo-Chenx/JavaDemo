package com.part03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class KeyThread extends Thread {

	PrintStream ps=null;
	public KeyThread(PrintStream ps)
	{
		this.ps=ps;
	}
	@Override
	public void run() {
		
	    String str=null;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
			while(null!=(str=br.readLine()))
			{
				ps.println(str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
