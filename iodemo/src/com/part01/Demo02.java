package com.part01;

import java.io.File;
import java.net.URISyntaxException;

public class Demo02 {

	public static void main(String[] args) throws URISyntaxException {
		File f1=new File("c:\\");
		File f2=new File(f1,"abc.txt");
        File f3=new File("c:\\","abc.txt");	
        File f4=new File(Demo02.class.getResource("/com/part01/aa.txt").toURI());
        System.out.println(f4);
        System.out.println(f2.equals(f3));
		
	}

}
