package com.part8;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

/**
 * java.util.Properties��Map��ʵ���ֻ࣬������key��value�����ַ���
 * Properties���Ժ��ⲿ�ļ�������  
 * @author Administrator
 *
 */
public class Demo01 
{
  public static void main(String[] args) throws Exception
  {
	    Properties p=new Properties();
	    
	    p.setProperty("mp3", "����");
	    p.put("mp4", "��Ƶ");
	    p.setProperty("txt", "�ı�");
	    //System.out��ʾ����̨
	    p.list(System.out);
	    p.list(new PrintStream("c:\\ttt.properties"));
   }
}
