package com.part6;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
//ͬ������TreeMap�е�keyһ��Ҫʵ��comparable��Comparetor...
public class Demo05 {

	public static void main(String[] args) {

     Map<String,Object> map=new TreeMap<String,Object>();
     map.put("mp3", "����");
     map.put("exe", "��ִ��");
     map.put("mp4", "��Ƶ");
     
     
   
   Set<Map.Entry<String,Object>>  all=map.entrySet();
   for(Map.Entry<String,Object> en:all)
   {
	   System.out.println(en.getKey()+"***"+en.getValue());
   }
   
	}

}
