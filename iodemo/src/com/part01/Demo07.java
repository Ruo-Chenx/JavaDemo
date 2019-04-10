package com.part01;

import java.io.File;

public class Demo07 {

	public static void main(String[] args) {

    File f=new File("c:\\");
    
    //列出目录下所有内容
    File[]all=f.listFiles();
    for(File tem:all)
    {
    	if(tem.isDirectory())
    	System.out.println("<dir>   "+tem);
    	else
    		System.out.println(tem);	
    }
	}

}
