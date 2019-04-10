package com.part02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Demo01 {

	public static void main(String[] args) throws IOException 
	{
		File f=new File("F:\\iodemo.txt");
		OutputStream os=new FileOutputStream(f);
	//  OutputStream os=new FileOutputStream("c:\\iodemo.txt");
		os.write(97);
        os.write(13);
        os.write(66);
        os.write((int)'\n');
        os.write((int)'\r');
        os.flush();
        os.close();
        System.out.println("Ok");
	}

}
