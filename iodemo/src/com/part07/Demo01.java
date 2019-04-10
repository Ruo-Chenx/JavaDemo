package com.part07;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * java.io.Writer  字符输出流
  * 我们操作的是字符，，但是存在文件后就变成字节，也就是说
  * 字符流对字符做了编码和解码
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args)throws Exception
	{
	   FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
	   Writer wr=new OutputStreamWriter(fo);
	   
	   String str="大家好吗？";
	   wr.write(str.toCharArray());
	   
	   wr.close();
	   System.out.println("OK");

	}

}
