package com.part07;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.SortedMap;

/**
 * java.nio.charset  ��װ�ı���
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {

		//�õ�ϵͳ֧�ֵ����б���
		SortedMap<String,Charset>  all=Charset.availableCharsets();
		Iterator<String> it=all.keySet().iterator();
		while(it.hasNext())
		{
			String key=it.next();
			Charset c=all.get(key);
			System.out.println(key+"::"+c);
		}
		

	}

}
