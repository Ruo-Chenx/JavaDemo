package com.part10;

import java.util.ArrayList;
import java.util.List;
/**
 * jdk1.5 ֮������м��Ͻӿں��඼��д�ˣ����˷��ͣ�������Ԫ�ص�����
 * Object[]aa=new Object[]{} ;
 * String bb[]=new String[];   
 * aa=bb;
 * List<String>��List<Object>������
 * 
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args)
	{
		List<Object> list=new ArrayList<Object>();
		list.add(new Object());
		list.add(new String());
		list.add(23);
		
	
		List<String> l1=new ArrayList<String>();
		l1.add("hello");
		l1.add("welcome");
		
		
		
		Object[]aa=new Object[]{} ;
		String bb[]=new String[] {};

		
		aa=bb;
		
		//list=l1;
		

	}

}
