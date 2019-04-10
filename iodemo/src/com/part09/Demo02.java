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
				
				buffer.flip();//�� position�ŵ�0   limit�ŵ�ԭposition ��λ�ã�   p--l֮������Ч����
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
		
		//��p�ŵ�0    l ��c �ŵ���ĩβ���ȴ���һ�ζ�
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
		
		//��p ---l�����û�ж���
		if(buffer.hasRemaining())
		{
			//p--l֮��Ķ�������
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
	//��p��Ϊ0 ,ֵ û��û��
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
