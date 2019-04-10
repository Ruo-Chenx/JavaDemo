package com.part01;

import java.io.File;
import java.io.IOException;

public class Demo03 {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("F:\\abc.txt");
		boolean re=f1.createNewFile();
		System.out.println(re);
		
		//创建文件，要求上级目录一定存在
		/*File f2=new File("F:\\aaaa\\abc.txt");
		boolean re2=f2.createNewFile();
		System.out.println(re2);*/
		
		File f3=new File("F:\\aaaa");
		f3.mkdir();
		
	}

}
