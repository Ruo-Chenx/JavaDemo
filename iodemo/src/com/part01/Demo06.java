package com.part01;

import java.io.File;

public class Demo06 {

	public static void main(String[] args) {

    File f=new File("c:\\");
    
    //列出目录下所有内容
    String[]all=f.list();
    for(String tem:all)
    {
    	System.out.println(tem);
    }
    
    
    
	}

}
