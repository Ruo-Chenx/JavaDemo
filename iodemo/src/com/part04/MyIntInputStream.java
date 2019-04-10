package com.part04;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class MyIntInputStream extends FilterInputStream {

	private InputStream is;
	protected MyIntInputStream(InputStream in) {
		super(in);
		this.is=in;
	}
	
	public int readInt()throws Exception
	{
		int re=-1;
		byte[]tem=new byte[4];
	    int len=is.read(tem);
	   // System.out.println(Arrays.toString(tem));
	    if(len==4)
	    {
	    	//���ֽ�תΪ����
	    	re=(tem[3]&0xFF)|((tem[2]&0xFF)<<8)|((tem[1]&0xFF)<<16)|((tem[0]&0xFF)<<24);
	    }else
	    {
	       throw	new IOException("����һ������!");
	    }
	    
	    return re;
	}

}
