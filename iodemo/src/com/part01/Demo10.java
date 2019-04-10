package com.part01;

import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;

public class Demo10 {

	public static void main(String[] args) {

		  File f=new File("F:\\");
		  
		  File[]all=f.listFiles(new FileFilter() {
			
			@Override
			public boolean accept(File pathname) {
				
				return pathname.isDirectory();
			}
		});
		  
		  for(File str:all)
		  {
			  System.out.println(str);
		  }

	}

}
