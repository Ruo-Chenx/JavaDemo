package com.part07;

import java.io.FileWriter;
import java.io.IOException;
/**
 *  java.io.FileWriter extends OutputStreamWriter
 *  java.io.FileReader extends InputStreamReader
 *  ��������û������������չ��ֻ�ǹ������ȽϺ��ã�����ع���Reader��Writer
 * @author Administrator
 *
 */
public class Demo07
{

	public static void main(String[] args) throws IOException 
	{
           FileWriter fw=new FileWriter("c:\\iodemo.txt");
           fw.write("�����������");
           fw.close();
           System.out.println("-------");

	}

}
