package com.part07;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  java.io.BufferedWriter extends Writer
 *  jvaa.io.BufferedReader extends Reader
 *  �����棬����д���з������԰��ж���
 *  Ҫ���Ѵ��ڵ�Reader ��Writer����
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args) throws IOException 
	{
	    FileWriter  fw=new FileWriter("c:\\iodemo.txt");
	    BufferedWriter  br=new BufferedWriter(fw);
	    
	    br.write("��Һ�");
	    br.newLine();
	    br.write("������");
	    br.newLine();
	    br.write("----");
	    
	    br.close();
	    System.out.println("OK");

	}

}
