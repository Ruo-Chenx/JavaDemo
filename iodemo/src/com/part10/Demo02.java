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
		//������õ���FileChannelֻ�����
		FileChannel  fc=fo.getChannel();
		
		String str="������������?";
		byte[] data=str.getBytes();
     	ByteBuffer buf=ByteBuffer.allocate(50);
     	buf.put(data);
     	
     	buf.flip();//p--l֮�����Ч��
		
		fc.write(buf);
		
		fc.close();
		System.out.println("OK");

	}

}
