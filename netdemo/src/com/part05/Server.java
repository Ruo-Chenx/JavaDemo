package com.part05;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Arrays;

public class Server {

	public static void main(String[] args)throws Exception
	{
		 ServerSocket server=new ServerSocket(8888);
         System.out.println("server start....");
      
         Socket s=server.accept();
         
         InputStream is=s.getInputStream();
         int len=-1;
         byte[] buffer=new byte[512];
         while((len=is.read(buffer))>0)
         {
        	 if(len>=5)
        	 {
        		 //读报头
        		 int headtype=buffer[0];
        		 byte []lent=new byte[4];
        		 System.arraycopy(buffer, 1, lent, 0, 4);
        		 int lenth=IntBytesUtils.byte2int(lent);
        		 
        		 if(headtype==1&&len-5==lenth)
        		 {
        			 //文本
        			 byte [] data=new byte[lenth];
        			 
        			 System.arraycopy(buffer, 5, data, 0, lenth);
        			 System.out.println(Arrays.toString(data));
        			 System.out.println(new String(data));
        		 }
        		 if(headtype==2&&len-5==lenth)
        		 {
        			 //图片
        			 byte [] data=new byte[lenth];
        		/*	 
        			 System.arraycopy(buffer, 5, data, 0, lenth);
        			 System.out.println(Arrays.toString(data));
        			 System.out.println(new String(data));*/
        		 }
        	 }
         }
        	
      
	}

	
}
