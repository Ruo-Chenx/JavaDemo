package com.part06;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class Demo02 {

	public static void main(String[] args) throws IOException 
	{
		 String str="��Һ��𡣲��Ǽӻ���ü�ǼӲ���j09";
		 ByteArrayInputStream  bi=new ByteArrayInputStream(str.getBytes());
		 
		 byte[]buffer=new byte[512];
		 
		 int len=-1;
		 
		 len=bi.read(buffer);
		 
		 System.out.println(new String(buffer,0,len));

	}

}
