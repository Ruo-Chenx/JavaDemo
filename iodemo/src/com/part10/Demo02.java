package com.part10;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class Demo02 {

	public static void main(String[] args) throws IOException 
	{
		FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
		//输出流得到的FileChannel只能输出
		FileChannel  fc=fo.getChannel();
		
		String str="张三回来了吗?";
		byte[] data=str.getBytes();
     	ByteBuffer buf=ByteBuffer.allocate(50);
     	buf.put(data);
     	
     	buf.flip();//p--l之间的有效数
		
		fc.write(buf);
		
		fc.close();
		System.out.println("OK");

	}

}
