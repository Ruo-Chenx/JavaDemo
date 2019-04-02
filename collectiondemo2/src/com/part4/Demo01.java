package com.part4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * java.util.Set接口继承自java.util.Collection
 * 没有增加任何方法，只是Set中的对象不以重复（两个对象的hashcode值相同，equals为true）
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
