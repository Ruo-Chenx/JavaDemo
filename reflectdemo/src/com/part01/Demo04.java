package com.part01;

import java.lang.reflect.Method;

/**
 * 对方法的操作
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args)throws Exception {

		Class<Student> clazz=Student.class;
		Student stu=clazz.newInstance();
		System.out.println("------------所有的方法---------------------");
		Method [] all=clazz.getDeclaredMethods();
		for(Method m:all)
		{
			System.out.println(m);
		}
		System.out.println("------------找指定参数的方法---------------------");
       
		Method setname=clazz.getMethod("setName", new Class[] {String.class});
		//调用方法
		//相当于stu.setName("goto")
		setname.invoke(stu, new Object[] {"goto"});
		//setname.invoke(stu, "goto");
		System.out.println(stu);
	}

}
