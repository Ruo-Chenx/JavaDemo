package com.part01;

import java.lang.reflect.Method;

/**
 * �Է����Ĳ���
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args)throws Exception {

		Class<Student> clazz=Student.class;
		Student stu=clazz.newInstance();
		System.out.println("------------���еķ���---------------------");
		Method [] all=clazz.getDeclaredMethods();
		for(Method m:all)
		{
			System.out.println(m);
		}
		System.out.println("------------��ָ�������ķ���---------------------");
       
		Method setname=clazz.getMethod("setName", new Class[] {String.class});
		//���÷���
		//�൱��stu.setName("goto")
		setname.invoke(stu, new Object[] {"goto"});
		//setname.invoke(stu, "goto");
		System.out.println(stu);
	}

}
