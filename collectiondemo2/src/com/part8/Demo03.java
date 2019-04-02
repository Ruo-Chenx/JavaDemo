package com.part8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class Demo03 {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		   /*  Properties p=new Properties();
		     
		     p.load(new FileInputStream("c:\\ttt_zh_CN.properties"));

		     p.storeToXML(new FileOutputStream("c:\\ttt.xml"), "aaa");
		     */
		
		Properties p=new Properties();
	    p.loadFromXML(new FileInputStream("c:\\ttt.xml"));
	    
	    p.list(System.out);
		     
	}

}
