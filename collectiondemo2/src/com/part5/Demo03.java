package com.part5;

import java.util.Set;
import java.util.TreeSet;
/**
 * Treesetʵ����SotedSet��һ�������Set��Ĭ��������Ȼ������
 * ����TeeSet �е�ÿ��Ԫ�أ�����ʵ�� java.lang.Comparable
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
