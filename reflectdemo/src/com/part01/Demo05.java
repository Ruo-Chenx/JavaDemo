package com.part01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 
 * 对成员的操作
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) throws Exception {
	 
		
		Class clazz=Class.forName("com.part01.Student");
		Student stu=(Student)clazz.newInstance();
		
		Field  all[]=clazz.getDeclaredFields();
		//getModifiers() 返回由该 Field对象表示的字段的Java语言修饰符，作为整数。
		for(Field f:all)
		{
			System.out.println(f+"::"+f.getType()+"::"+f.getModifiers()+":::"+Modifier.isPublic(f.getModifiers()));
		}
		System.out.println("---得到指定"
				+ ""
				+ "filed----------");
		
		Field fname=clazz.getDeclaredField("name");
		fname.setAccessible(true);//私有成员设值
		
		fname.set(stu, "小明");//给成员设值
		System.out.println(stu);
		//调用成员的值
		Object re=fname.get(stu);//stu.getName()
		System.out.println(re);
		
	}

}
