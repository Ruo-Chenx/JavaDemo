package com.part02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo04 {

	public static void main(String[] args) throws IOException {

     FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
	 
     for(int i=0;i<=256;i++)
     {
    	 fo.write(i);
     }
     
     fo.close();
     System.out.println("OK");
     
	}

}
