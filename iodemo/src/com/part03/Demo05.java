package com.part03;

import java.io.File;
import java.util.Arrays;

/**
 * 1、加密解密
 * 2、大文件的拆分与合并
 * 3、U盘小偷程序
 * @author Administrator
 *
 */
public class Demo05 {
public static void main(String[] args)throws Exception {
	
	
	//有没有加上u盘
	File [] roots=File.listRoots();
	String strall=Arrays.toString(roots);
	while(true)
	{
		
		
		if(File.listRoots().length>roots.length)
		{
			//有u盘
			File [] tems=File.listRoots();
			for(File f:tems)
			{
				if(-1==strall.indexOf(f.toString()))
				{
					System.out.println("---找到:"+f);
				}
			}
		}
		System.out.print(".");
		Thread.sleep(10000);
	}
	
	
}
}
