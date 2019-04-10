package com.part07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  java.io.BufferedWriter extends Writer
 *  jvaa.io.BufferedReader extends Reader
 *  带缓存，可以写换行符，可以按行读，
 *  要用已存在的Reader 和Writer构建
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) throws IOException 
	{
	    FileWriter  fw=new FileWriter("c:\\iodemo.txt");
	    BufferedWriter  br=new BufferedWriter(fw);
	    
	    br.write("大家好");
	    br.newLine();
	    br.write("明天来");
	    br.newLine();
	    br.write("----");
	    
	    br.close();
	    System.out.println("OK");

	}

}
