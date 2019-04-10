package com.part07;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Demo09 {

	public static void main(String[] args) throws IOException 
	{
		FileReader fi=new FileReader("c:\\iodemo.txt");
		BufferedReader br=new BufferedReader(fi);
		
		
		String str=null;
		while(null!=(str=br.readLine()))
		{
			System.out.println(str);
		}
   br.close();
   
	}

}
