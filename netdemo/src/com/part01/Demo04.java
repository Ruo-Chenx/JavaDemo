package com.part01;

import java.net.URLDecoder;
import java.net.URLEncoder;
/**
 * URL���룬�ѿ��ֽ�תΪ���ֽ�
 * httpĬ���õľ���URL����
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args)throws Exception {
		String str="http://localhost/s?name=����&sex=��";
		
		
	String en=	URLEncoder.encode(str,"utf-8");
	
	System.out.println(en);

	String zh=URLDecoder.decode(en, "utf-8");
	System.out.println(zh);

	}

}
