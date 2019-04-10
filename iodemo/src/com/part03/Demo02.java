package com.part03;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) throws IOException 
	{
		FileInputStream fi=new FileInputStream("F:\\iodemo.txt");
		//不阻塞的情况下可以读取的字节数
		int len=fi.available();
		
		byte[] data=new byte[len];
		System.out.println(Arrays.toString(data));
		
		int readlen=fi.read(data);
		
		System.out.println(Arrays.toString(data));
		System.out.println(readlen);
		
		System.out.println(new String(data,"GBK"));

	}

}
