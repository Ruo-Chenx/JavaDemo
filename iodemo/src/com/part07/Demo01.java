package com.part07;

import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

/**
 * java.io.Writer  �ַ������
  * ���ǲ��������ַ��������Ǵ����ļ���ͱ���ֽڣ�Ҳ����˵
  * �ַ������ַ����˱���ͽ���
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args)throws Exception
	{
	   FileOutputStream fo=new FileOutputStream("F:\\iodemo.txt");
	   Writer wr=new OutputStreamWriter(fo);
	   
	   String str="��Һ���";
	   wr.write(str.toCharArray());
	   
	   wr.close();
	   System.out.println("OK");

	}

}
