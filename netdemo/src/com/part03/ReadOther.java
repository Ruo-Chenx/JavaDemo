package com.part03;

import java.io.BufferedReader;
import java.io.IOException;

public class ReadOther extends Thread {
	
	BufferedReader br ;
	private String name;
	public ReadOther(String name,BufferedReader br)
	{
		this.name = name;
		this.br = br;
	}
	@Override
	public void run() {
		String str=null;
		try {
			while(null!=(str=br.readLine()))
			{
				System.out.println(name+":"+str);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
