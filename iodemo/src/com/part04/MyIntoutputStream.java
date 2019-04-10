package com.part04;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

public class MyIntoutputStream extends FilterOutputStream {

	private OutputStream os=null;
	public MyIntoutputStream(OutputStream out) {
		super(out);
		 this.os=out;
	}

	
	public void writeInt(int data)throws IOException
	{
		//intתΪbyte[]
		byte[] tem=new byte[4];
		tem[3]=(byte)(data&0xFF);
		tem[2]=(byte)(data>>8&0xFF);
		tem[1]=(byte)(data>>16&0xFF);
		tem[0]=(byte)(data>>24&0xFF);
		os.write(tem);
		System.out.println(Arrays.toString(tem));
	}
}
