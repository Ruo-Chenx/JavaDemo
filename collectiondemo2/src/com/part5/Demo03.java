package com.part5;

import java.util.Set;
import java.util.TreeSet;
/**
 * Treeset实现了SotedSet是一个有序的Set，默认是以自然序排列
 * 放入TeeSet 中的每个元素，必须实现 java.lang.Comparable
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set set=new TreeSet();
		set.add("lisa");
		set.add("angel");
		set.add("jack");
		set.add("baa");
		
		for(Object obj:set)
		{
			System.out.println(obj);
		}
	}

}
