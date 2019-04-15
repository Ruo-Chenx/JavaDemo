package com.part05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class Client {

	public static void main(String[] args) throws Exception{

       Socket s=new Socket(InetAddress.getByName("192.168.0.10"),8888);
       
       OutputStream os=s.getOutputStream();
       
       String str=null;
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    try {
			while(null!=(str=br.readLine()))
			{
				byte[] data=str.getBytes();
				int len=data.length;
				byte[] lenth=IntBytesUtils.int2bytes(len);
				
				byte [] all=new byte[1+4+len];
				all[0]=1;
				System.arraycopy(lenth, 0, all, 1, 4);
				System.arraycopy(data, 0, all, 5, len);
				
				os.write(all);
				os.flush();
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
       
       
       
	}

}
