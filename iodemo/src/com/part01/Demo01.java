package com.part01;

import java.io.File;

/**
 * java.io.File�������ļ���Ŀ¼����Ϣ
  * ��д��toString
  * ��д��equalsֻҪ�����ļ���Ŀ¼��·����ͬ��Ϊtrue
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args)
	{
		System.out.println(File.separator);
		System.out.println(File.pathSeparator);
		
		File f1=new File("c:\\abc.txt");
		File f2=new File("c:"+File.separator+"abc.txt");
		System.out.println(f1);
		System.out.println(f1==f2);
		System.out.println(f1.equals(f2));
	}

}
