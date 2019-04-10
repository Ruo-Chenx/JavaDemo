package com.part05;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class Demo02 {

	public static void main(String[] args)throws Exception {
		
	FileInputStream fi=new FileInputStream("c:\\iodemo.txt");
	DataInputStream di=new DataInputStream(fi);
	
	int r1=di.readInt();
	boolean r2=di.readBoolean();
	double r3=di.readDouble();
	String r4=di.readUTF();
	int re=di.read();
	//int r5=di.readChar();
	
	System.out.println(r1);
	System.out.println(r2);
	System.out.println(r3);
	System.out.println(r4);
	System.out.println(re);
	
	}

}
