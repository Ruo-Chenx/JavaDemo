package com.part05;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * public class BufferedInputStream extends FilterInputStream
 * public class BufferedOutputStream  extends FilterOutputStream
 * û�������κη��������Ǵ����� ��������֧��mark..
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) throws Exception
	{
		String str="��Һ����������ԺóԵ�!";
		byte[] data=str.getBytes("utf-8");
		
		FileOutputStream fo=new FileOutputStream("c:\\iodemo.txt");
		
		BufferedOutputStream bo=new BufferedOutputStream(fo);
		
		bo.write(data, 3, 12);
		
		bo.close();
		
		System.out.println("OK....");
		

	}

}
