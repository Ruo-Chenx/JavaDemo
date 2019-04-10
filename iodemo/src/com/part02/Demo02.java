package com.part02;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Demo02 {

	public static void main(String[] args) throws IOException {

     FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
		
     String str="明天吃好吃的";
     byte[]data=str.getBytes();
     System.out.println(Arrays.toString(data));
     
     fo.write(data);
     
     fo.close();
     System.out.println("OK");
     
	}

}
