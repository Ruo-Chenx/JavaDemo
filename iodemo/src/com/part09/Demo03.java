package com.part09;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;

import org.junit.Test;
/**
 * �ַ�����ByteBuffer֮��ת��
 * Charset   
 * @author Administrator
 *
 */
public class Demo03
{
	@Test
   public void bytebuffer2string()
   {
	   ByteBuffer buf=ByteBuffer.allocate(10);
	   buf.put((byte)97);
	   buf.put((byte)98);
	   buf.put((byte)99);
	   buf.flip();
	   
	   CharBuffer charbuffer=Charset.defaultCharset().decode(buf);
	   System.out.println(charbuffer);
	   
   }
	
	@Test
	public void String2ByteBuffer()
	{
		String str="abc";
	    Charset charset=Charset.forName("utf-8");
	    ByteBuffer buf=charset.encode(str);
	    
	    System.out.println("position:"+buf.position()+"----limit:"+buf.limit()+"----->capacity"+buf.capacity());
	}
}
