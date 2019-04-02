package com.part9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * java.util.Collection接口  
 * java.util.Collections 类  类于java.util.Arrays
 * java.util.Arrays操作数组的工具类
 * java.util.Collections操作集合的工具类   List  Set  Map
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
		
	//	Collections.sort(list);//对 List进行排序  要求List中元素都要实现比较器
		int re=Collections.binarySearch(list, "8");//调binary..之前先排序
		System.out.println(re);
		
		Collections.shuffle(list);
		for(String i:list)
		{
			System.out.println(i);
		}
		
		

	}

}
