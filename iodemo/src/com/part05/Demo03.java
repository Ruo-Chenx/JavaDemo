package com.part05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * public class BufferedInputStream extends FilterInputStream
 * public class BufferedOutputStream  extends FilterOutputStream
 * 没有增加任何方法，但是带缓存 ，，而且支持mark..
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) throws Exception
	{
		String str="大家好吗？来西安吃好吃的!";
		byte[] data=str.getBytes("utf-8");
		
		FileOutputStream fo=new FileOutputStream("c:\\iodemo.txt");
		
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		
		bo.write(data, 3, 12);
		
		bo.close();
		
		System.out.println("OK....");
		

	}

}
