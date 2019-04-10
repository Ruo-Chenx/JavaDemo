package com.part08;

import java.io.IOException;
import java.io.RandomAccessFile;

public class Demo03 {

	public static void main(String[] args) throws IOException 
	{
		RandomAccessFile rf=new RandomAccessFile("c:\\iodemo.txt", "rw");
		
		rf.seek(4);
		double re=rf.readDouble();
		
		
		rf.seek(0);
        rf.writeUTF("´ó¼ÒºÃ");
        rf.seek(0);
        System.out.println(rf.readUTF());
       
        
        rf.close();
	}

}
