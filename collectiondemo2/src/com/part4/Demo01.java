package com.part4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set�ӿڼ̳���java.util.Collection
 * û�������κη�����ֻ��Set�еĶ������ظ������������hashcodeֵ��ͬ��equalsΪtrue��
 * @author Administrator
 *
 */
public class Demo01 {

	public static void main(String[] args) 
	{
	    Set set=new HashSet();
	    set.add("lisia");
	    set.add("jack");
	    set.add("ala");
	    set.add("wangwu");
	    set.add("jack");
	    
	    
	    Iterator it=set.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }

	}

}
