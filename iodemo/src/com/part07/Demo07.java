package com.part07;

import java.io.FileWriter;
import java.io.IOException;
/**
 *  java.io.FileWriter extends OutputStreamWriter
 *  java.io.FileReader extends InputStreamReader
 *  它们两个没有做方法的扩展，只是构方法比较好用，方便地构造Reader和Writer
 * @author Administrator
 *
 */
public class Demo07
{

	public static void main(String[] args) throws IOException 
	{
           FileWriter fw=new FileWriter("c:\\iodemo.txt");
           fw.write("大家中中中中");
           fw.close();
           System.out.println("-------");

	}

}
