package com.part04;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * FilterInputStream
 *  FilterOutputStream
  *  用于扩展父类的功能，继承自InputStream和OutputStream，没有做任何方法的扩展
 * 
 *
 *
 */
public class Demo01 {

	public static void main(String[] args)throws Exception {
		FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
		
		MyIntoutputStream myout=new MyIntoutputStream(fo);
		
		
		for(int i=200;i<300;i++)
		{
		   myout.writeInt(i);
		}
		myout.close();
		System.out.println("OK");
		
		
		/*FileInputStream fi=new FileInputStream("F:\\iodemo.txt");
		MyIntInputStream myii=new MyIntInputStream(fi);
		int re=-1;
		while((re=myii.readInt())!=-1)
		{
			System.out.println(re);
		}
		fi.close();*/

	}

}
