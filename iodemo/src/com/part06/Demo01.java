package com.part06;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * ByteArrayOutputStream���ڴ������
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write("��Һ���".getBytes());
		bos.close();
		
		byte[]re=bos.toByteArray();
		
		System.out.println(Arrays.toString(re));
		

	}

}
