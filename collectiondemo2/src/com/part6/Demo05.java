package com.part6;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//同样放入TreeMap中的key一定要实现comparable和Comparetor...
public class Demo05 {

	public static void main(String[] args) {

     Map<String,Object> map=new TreeMap<String,Object>();
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
