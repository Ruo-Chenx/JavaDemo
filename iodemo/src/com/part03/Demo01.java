package com.part03;

import java.io.FileInputStream;
import java.io.IOException;

public class Demo01 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("F:\\iodemo.txt");
		
		int data=-1;
		
		while(-1 != (data = fi.read()) )	
				{
			       System.out.print((char)data);
				}

	}

}
