package com.part01;

import java.io.File;
import java.io.FilenameFilter;

public class Demo08 {

	public static void main(String[] args) {

		  File f=new File("F:\\");
		  
		  String[]all=f.list(new FilenameFilter() 
		  {
			
			@Override
			public boolean accept(File dir, String name) {
				
				return name.toLowerCase().endsWith(".txt");
			}
		 });
		  
		  for(String str:all)
		  {
			  System.out.println(str);
		  }

	}

}
