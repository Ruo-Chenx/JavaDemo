package com.part6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Hashtable和 HashMap都是Map的实现类，只是
 * Hashtable是线程安全的
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {

     Map<String,Object> map=new Hashtable<String,Object>();
     map.put("mp3", "音乐");
     map.put("exe", "可执行");
     map.put("mp4", "视频");
     
     
   
   Set<Map.Entry<String,Object>>  all=map.entrySet();
   for(Map.Entry<String,Object> en:all)
   {
	   System.out.println(en.getKey()+"***"+en.getValue());
   }
   
	}

}
