package com.part03;

import java.io.File;
import java.util.Arrays;

/**
 * 1�����ܽ���
 * 2�����ļ��Ĳ����ϲ�
 * 3��U��С͵����
 * @author Administrator
 *
 */
public class Demo05 {
public static void main(String[] args)throws Exception {
	
	
	//��û�м���u��
	File [] roots=File.listRoots();
	String strall=Arrays.toString(roots);
	while(true)
	{
		
		
		if(File.listRoots().length>roots.length)
		{
			//��u��
			File [] tems=File.listRoots();
			for(File f:tems)
			{
				if(-1==strall.indexOf(f.toString()))
				{
					System.out.println("---�ҵ�:"+f);
				}
			}
		}
		System.out.print(".");
		Thread.sleep(10000);
	}
	
	
}
}
