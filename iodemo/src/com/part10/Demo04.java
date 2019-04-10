package com.part10;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Demo04 {

	public static void main(String[] args) throws IOException 
	{
		//¸´ÖÆ
		FileInputStream fi=new FileInputStream("D:\\eclipse-dsl-2018-09-win32-x86_64.zip");
		FileOutputStream fo=new FileOutputStream("F:\\eclipse.zip");
		
		FileChannel  fic=fi.getChannel();
		FileChannel  foc=fo.getChannel();
		
		ByteBuffer buffer = ByteBuffer.allocate(4096);
		long start= System.currentTimeMillis();
		int len=-1;
		
          while((len=fic.read(buffer))>0)
          {
        	  buffer.flip();
        	  foc.write(buffer);
        	  buffer.clear();
          }
          fic.close();
          foc.close();
          
          long end= System.currentTimeMillis();
          
          System.out.println((end-start)/1000.0);
	}

}
