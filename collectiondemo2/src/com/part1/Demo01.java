package com.part1;

import java.util.Date;

/**
 * 1、什么是java中的集合框架
 *    java写了很多的类的接口，这些类库用是用于管理一组对象的类库，
 *    我们把java中管理对像的类库叫集合框架，
 *    在java.util.* 
 *    
 *     把我们的Demo01当成一个容器，可以加东西，也可删东西
 *     
 *     理解管理其它对象的对象
 * @author Administrator
 *
 */
public class Demo01
{
	Object [] data=new Object[10];
	int index=0;
	
	
	public void add(Object o)
	{
		data[index++]=o;
	}
	
	public Object removeLast()
	{
		return data[--index];
	}
	

	public static void main(String[] args) 
	{
		Demo01 d1=new Demo01();
		d1.add("hello");
		d1.add(new Date());
		d1.add(123);
		
		System.out.println(d1.removeLast());
		System.out.println(d1.removeLast());
		System.out.println(d1.removeLast());
		
	}

}
