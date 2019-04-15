package com.part01;

import java.net.InetAddress;

/*
 * IP
 * java.net.InetAddress √Ë ˆip
 */
public class Demo01 {

	public static void main(String[] args) throws Exception
	{
		InetAddress ip=InetAddress.getLocalHost();
		//InetAddress ip1=InetAddress.getByName("www.baidu.com");
		//InetAddress ip2[]=InetAddress.getAllByName("www.baidu.com");
		InetAddress ip3=InetAddress.getByAddress(new byte[] {(byte)192,(byte)168,(byte)1,(byte)10});
		InetAddress ip4=InetAddress.getByName("192.168.0.10");
		
		
		System.out.println(ip);
		//System.out.println(ip1);
		System.out.println(ip3);
		System.out.println(ip4);
		

	}

}
