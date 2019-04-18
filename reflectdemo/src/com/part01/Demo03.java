package com.part01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03 {

	public static void main(String[] args) 
			throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
	   Class clazz=Student.class;
	   
	   //只得到public的构造方法
	   //Constructor<Student> []all=clazz.getConstructors();
	   //得到所有构造方法  包括private
	  Constructor<Student> []all=clazz.getDeclaredConstructors();
	   
	   for(Constructor con:all)
	   {
		   System.out.println(con);
	   }

	   
	   //得到指定参数的构造方法
	   Constructor<Student> cons=clazz.getDeclaredConstructor(new Class[] {String.class,int.class});
	   
	   Student stu=cons.newInstance(new Object[] {"李四" ,23});
	   System.out.println(stu);
	   
	   //为了实例化对像方法java.lang.Class有一个 newinstance 方法调用不带参数的构造方法
	   
	   
	   Student stu1=(Student)clazz.newInstance();//调用不带参数的构造方法
	   System.out.println(stu1);
	   
	   
	}

}
