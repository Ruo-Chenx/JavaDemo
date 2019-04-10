package com.part07;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Demo06 {

	public static void main(String[] args) throws IOException {
		FileInputStream fi=new FileInputStream("c:\\iodemo.txt");
		//Reader re=new InputStreamReader(fi);
		InputStreamReader re=new InputStreamReader(fi,"utf-8");
		System.out.println(re.getEncoding());
		char [] buffer=new char[50];
		
		int len=re.read(buffer);
		
		System.out.println(Arrays.toString(buffer));
		System.out.println(new String(buffer));

	}

}
