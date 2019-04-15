package com.part01;

import java.net.*;
import java.io.*;

//用POST 方式发送数据 然后从结果中读取
public class Demo03
{
	public static void main(String args[])
	{
		try{
		
		URL url = new URL("http://localhost");
		HttpURLConnection uc =(HttpURLConnection) url.openConnection();
		uc.setDoOutput(true);
		
		OutputStream raw = uc.getOutputStream();
		OutputStream buf = new BufferedOutputStream(raw);
		OutputStreamWriter out = new OutputStreamWriter(buf,"GBK");
		out.write("myName=zhangsan&myEmail=zhangsan@hotmail.com");
		out.flush();
		out.close();
		
		InputStream in = uc.getInputStream();
		in = new BufferedInputStream(in);
		Reader r = new InputStreamReader(in);
		int c;
		System.out.println("==================Beging====================");
		while((c = r.read()) != -1)
		System.out.print((char) c);
		in.close();
		System.out.println("===================End======================");
		}
		catch(IOException e){
		///
		}
	}
}