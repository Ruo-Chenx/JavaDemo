package com.part7;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;

public class Demo03 {

	public static void main(String[] args) {
		Locale l=Locale.getDefault();
		//Locale l1=new Locale("en", "US");
		ResourceBundle res=ResourceBundle.getBundle("com.part7.res", l);
		
		String re=res.getString("name");
		
		System.out.println(re);

	}

}
