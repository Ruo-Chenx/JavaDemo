package com.part01;

import java.net.URLDecoder;
import java.net.URLEncoder;
/**
 * URL编码，把宽字节转为单字节
 * http默认用的就是URL编码
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args)throws Exception {
		String str="http://localhost/s?name=李四&sex=男";
		
		
	String en=	URLEncoder.encode(str,"utf-8");
	
	System.out.println(en);

	String zh=URLDecoder.decode(en, "utf-8");
	System.out.println(zh);

	}

}
