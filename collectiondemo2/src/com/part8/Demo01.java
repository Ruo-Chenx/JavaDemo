package com.part8;

import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Properties;

/**
 * java.util.Properties是Map的实现类，只是它的key和value都是字符串
 * Properties可以和外部文件作关联  
 * @author Administrator
 *
 */
public class Demo01 
{
  public static void main(String[] args) throws Exception
  {
	    Properties p=new Properties();
	    
	    p.setProperty("mp3", "音乐");
	    p.put("mp4", "视频");
	    p.setProperty("txt", "文本");
	    //System.out表示控制台
	    p.list(System.out);
	    p.list(new PrintStream("c:\\ttt.properties"));
   }
}
