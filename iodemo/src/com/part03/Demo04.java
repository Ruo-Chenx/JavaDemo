package com.part03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) throws IOException
	{
		FileInputStream fi=new FileInputStream("D:\\commons-lang3-3.8.1-bin.zip");
		FileOutputStream fo=new FileOutputStream("F:\\human.zip");
		byte []buffer=new byte[1024*4];
		int len=-1;
		
		while((len=fi.read(buffer))>0)
		{
			//System.out.println(len+":::"+Arrays.toString(buffer));
			fo.write(buffer, 0, len);
			System.out.println(len);
		}
		
		fi.close();
		fo.close();
		System.out.println("OK");
		
	}

}
