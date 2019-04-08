package com.part03;

import java.io.File;
import java.io.FilenameFilter;

/**
 * 图片加水
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) 
	{
		//File all[]=getFiles("c:\\jh");
		File all[]=getImageFiles("C:\\Users\\dell\\Desktop\\jh");
		for(File f:all)
			System.out.println(f);
	

	}
	/**
	 *  根据路径获取目录下所有文件
	 * @param path
	 * @return
	 */
	public static File[] getFiles(String path)
	{
		File[] re=null;
		File org=new File(path);
		re=org.listFiles();
		
		return re;
	}
	/**
	 *  根据路径获取目录下所有文件
	 * @param path
	 * @return
	 */
	public static String[] getFilesArray(String path)
	{
		String[] re=null;
		File org=new File(path);
		re=org.list();
		
		return re;
	}
	public static File[] getImageFiles(String path)
	{
		File[] re=null;
		File org=new File(path);
		re=org.listFiles(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				 if(name.toLowerCase().endsWith(".jpg"))
				return true;
				 else
					 return false;
			}
		});
		
		return re;
	}
	
	public static String[] getImageFilesArray(String path)
	{
		String[] re=null;
		File org=new File(path);
		re=org.list(new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				 if(name.toLowerCase().endsWith(".jpg"))
				return true;
				 else
					 return false;
			}
		});
		
		return re;
	}

}
