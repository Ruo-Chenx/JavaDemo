package com.part01;

import java.io.File;

public class Demo04 {

	public static void main(String[] args)throws Exception {

	for(int i=0;i<10;i++)
	{
	   File f=File.createTempFile("xzy", ".logs");
	   f.deleteOnExit();   //��������˳�ʱɾ���ļ�
	   
	}

	Thread.sleep(6000);
	}

}
