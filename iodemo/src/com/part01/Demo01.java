package com.part01;

import java.io.File;

/**
 * java.io.File描述了文件或目录的信息
  * 重写了toString
  * 重写了equals只要两个文件或目录的路径相同就为true
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args)
	{
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		
		File f1=new File("c:\\abc.txt");
		File f2=new File("c:"+File.separator+"abc.txt");
		System.out.println(f1);
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
	}

}
