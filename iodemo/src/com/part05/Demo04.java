package com.part05;

import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class Demo04 {

	public static void main(String[] args)throws Exception {
		FileInputStream fi=new FileInputStream("c:\\iodemo.txt");
       
		BufferedInputStream br=new BufferedInputStream(fi);
		
		byte[] data=new byte[3];
		
		br.read(data);
		System.out.println(br.markSupported());
		br.mark(3);
		
		byte[]data2=new byte[10];
		
		int len=br.read(data2);
		System.out.println(new String(data2,0,len,"utf-8"));
		
		br.reset();
		br.read(data);
		System.out.println(new String(data,"utf-8"));
		
		
	}

}
