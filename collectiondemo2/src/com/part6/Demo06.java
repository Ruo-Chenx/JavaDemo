package com.part6;

import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

/**
 * Hashtable�� HashMap����Map��ʵ���ֻ࣬��
 * Hashtable���̰߳�ȫ��
 * @author Administrator
 *
 */
public class Demo06 {

	public static void main(String[] args) {

     Map<String,Object> map=new Hashtable<String,Object>();
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
