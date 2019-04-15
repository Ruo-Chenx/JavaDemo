package com.part01;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

import org.apache.commons.io.IOUtils;

public class Demo02 {

	public static void main(String[] args)throws Exception {
		URL url=new URL("http://192.168.0.1/images/u11.png");
		
		URLConnection uc=url.openConnection();//打开一个连接
		//HttpURLConnection  huc=(HttpURLConnection)uc;
		InputStream is=uc.getInputStream();
		
		IOUtils.copy(is, new FileOutputStream("c:\\aaaa.png"));
		
		System.out.println("OK");

	}

}
