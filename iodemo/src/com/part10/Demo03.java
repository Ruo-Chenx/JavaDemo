package com.part10;

import java.io.FileInputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class Demo03 {

	public static void main(String[] args) throws Exception{
		
     Charset set=Charset.defaultCharset();
     
     FileInputStream fi = new FileInputStream("F:\\iodemo.txt");
     FileChannel fc = fi.getChannel();
     
     ByteBuffer buf=ByteBuffer.allocate(4096);
     info(buf);
     
     int len=-1;
     
     
    while((len=fc.read(buf))>0)
    {
    	 info(buf);
    	  buf.flip();
    	 String str=set.decode(buf).toString();
    	 System.out.println(str);
    	 buf.clear();//在下一次读之前 
    	 
    }
     fc.close();
     

	}
	public static void info(Buffer buf)
	{
		System.out.println("position:"+buf.position()+"----limit:"+buf.limit()+"----->capacity"+buf.capacity());
	}
}
