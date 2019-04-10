package com.part09;

import java.nio.Buffer;
import java.nio.ByteBuffer;

import org.junit.Test;

public class Demo02 {

	@Test
	public void testFlip()
	{
		///Buffer buffer=ByteBuffer.allocate(10);
				ByteBuffer buffer=ByteBuffer.allocate(10);
				info(buffer);
				buffer.put((byte) 23);
				buffer.put((byte) 24);
				info(buffer);
				
				buffer.flip();//将 position放到0   limit放到原position 的位置，   p--l之间是有效数据
				info(buffer);
	}
	
	@Test
	public void testClean()
	{
		ByteBuffer buffer=ByteBuffer.allocate(10);
		info(buffer);
		buffer.put((byte) 23);
		buffer.put((byte) 24);
		info(buffer);
		buffer.flip();
		info(buffer);
		
		//将p放到0    l 和c 放到最末尾，等待下一次读
		buffer.clear();
		info(buffer);
		
	}
   @Test
	public void testremain()
	{
		ByteBuffer buffer=ByteBuffer.allocate(10);
		info(buffer);
		buffer.put((byte) 23);
		buffer.put((byte) 24);
		info(buffer);
		buffer.flip();
		info(buffer);
		
		//在p ---l这间有没有东西
		if(buffer.hasRemaining())
		{
			//p--l之间的东西个数
			System.out.println(buffer.remaining());
		}

	}
   @Test
	public void testwind()
	{
		ByteBuffer buffer=ByteBuffer.allocate(10);
		info(buffer);
		buffer.put((byte) 23);
		buffer.put((byte) 24);
		info(buffer);
	//将p设为0 ,值 没有没变
		buffer.rewind();
		info(buffer);
		
		System.out.println(buffer.get());
		
		System.out.println(buffer.get());

	}
	public static void info(Buffer buf)
	{
		System.out.println("position:"+buf.position()+"----limit:"+buf.limit()+"----->capacity"+buf.capacity());
	}
}
