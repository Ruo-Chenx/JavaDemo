package com.part09;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * java.nio.Buffer  是内存区域，类似于数组
 * 
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) 
	{
		
		//Buffer buffer=ByteBuffer.allocate(10);
		ByteBuffer buffer=ByteBuffer.allocate(10);
		info(buffer);
		buffer.put((byte) 23);
		buffer.put((byte) 24);
		info(buffer);
		
		buffer.flip();//  翻转   将 position放到0   limit放到原position 的位置，   p--l之间是有效数据
		info(buffer);

	}
	
	public static void info(Buffer buf)
	{
		System.out.println("position:"+buf.position()+"----limit:"+buf.limit()+"----->capacity"+buf.capacity());
	}

}
