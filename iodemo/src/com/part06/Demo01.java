package com.part06;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Arrays;
/**
 * ByteArrayOutputStream是内存输出流
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) throws IOException
	{
		ByteArrayOutputStream bos=new ByteArrayOutputStream();
		bos.write("大家好吗？".getBytes());
		bos.close();
		
		byte[]re=bos.toByteArray();
		
		System.out.println(Arrays.toString(re));
		

	}

}
