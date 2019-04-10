package com.part09;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * java.nio.Buffer  ���ڴ���������������
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
		
		buffer.flip();//  ��ת   �� position�ŵ�0   limit�ŵ�ԭposition ��λ�ã�   p--l֮������Ч����
		info(buffer);

	}
	
	public static void info(Buffer buf)
	{
		System.out.println("position:"+buf.position()+"----limit:"+buf.limit()+"----->capacity"+buf.capacity());
	}

}
