package com.part7;

import java.util.Locale;

/**
 * java.util.Locale  描述国家和语言的信息
 * language  ISO 639 语言代码
 * country (region) ISO 3166  国家代码
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) 
	{
		 Locale l=Locale.getDefault();
		 System.out.println(l);
		 
		 Locale l1=Locale.CANADA_FRENCH;
		 System.out.println(l1);
		 
		 Locale l2=new Locale("en", "US");
		 System.out.println(l2);
		 
		 System.out.println("-------------------------");
	Locale[] all=	 Locale.getAvailableLocales();
	for(Locale tem:all)
	{
		System.out.println(tem);
	}

	}

}
