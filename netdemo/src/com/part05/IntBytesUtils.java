package com.part05;

import java.io.IOException;
import java.util.Arrays;

public class IntBytesUtils {
	public static int byte2int(byte[] tem)throws Exception
	{
		int re=0;
	    	//把字节转为整数
	    	re=(tem[3]&0xFF)|((tem[2]&0xFF)<<8)|((tem[1]&0xFF)<<16)|((tem[0]&0xFF)<<24);
	   
	    
	    return re;
	}
	public static byte[] int2bytes(int data)
	{
		//int转为byte[]
		byte[] tem=new byte[4];
		tem[3]=(byte)(data&0xFF);
		tem[2]=(byte)(data>>8&0xFF);
		tem[1]=(byte)(data>>16&0xFF);
		tem[0]=(byte)(data>>24&0xFF);
		 return tem;
	}
}
