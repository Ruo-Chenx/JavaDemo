package com.part9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.Collection�ӿ�  
 * java.util.Collections ��  ����java.util.Arrays
 * java.util.Arrays��������Ĺ�����
 * java.util.Collections�������ϵĹ�����   List  Set  Map
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) {
	  
		List<String> list=new ArrayList<String>();
		list.add("0");
		list.add("1");
		list.add("3");
		list.add("6");
		
	//	Collections.sort(list);//�� List��������  Ҫ��List��Ԫ�ض�Ҫʵ�ֱȽ���
		int re=Collections.binarySearch(list, "8");//��binary..֮ǰ������
		System.out.println(re);
		
		Collections.shuffle(list);
		for(String i:list)
		{
			System.out.println(i);
		}
		
		

	}

}
