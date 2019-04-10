package com.part07;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.Charset;

public class Demo05 {

	public static void main(String[] args) throws IOException 
	{
		  FileOutputStream fo=new FileOutputStream("c:\\iodemo.txt");
		  
		  Charset c=Charset.forName("utf-8");
		 // Charset c1=Charset.defaultCharset();
		  
		   Writer wr=new OutputStreamWriter(fo,c);
		   
		   String str="´ó¼ÒºÃÂð£¿";
		   wr.write(str.toCharArray());
		   
		   wr.close();
		   System.out.println("OK");

	}

}
