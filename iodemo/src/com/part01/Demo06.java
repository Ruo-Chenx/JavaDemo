package com.part01;

import java.io.File;

public class Demo06 {

	public static void main(String[] args) {

    File f=new File("c:\\");
    
    //�г�Ŀ¼����������
    String[]all=f.list();
    for(String tem:all)
    {
    	System.out.println(tem);
    }
    
    
    
	}

}
