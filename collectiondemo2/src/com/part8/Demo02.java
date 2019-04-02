package com.part8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Demo02 {

	public static void main(String[] args) throws FileNotFoundException, IOException {

     Properties p=new Properties();
     
     p.load(new FileInputStream("c:\\ttt_zh_CN.properties"));
     
     p.list(System.out);

	}

}
