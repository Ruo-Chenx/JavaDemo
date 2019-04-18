package com.part01;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Demo03 {

	public static void main(String[] args) 
			throws NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException 
	{
	   Class clazz=Student.class;
	   
	   //ֻ�õ�public�Ĺ��췽��
	   //Constructor<Student> []all=clazz.getConstructors();
	   //�õ����й��췽��  ����private
	  Constructor<Student> []all=clazz.getDeclaredConstructors();
	   
	   for(Constructor con:all)
	   {
		   System.out.println(con);
	   }

	   
	   //�õ�ָ�������Ĺ��췽��
	   Constructor<Student> cons=clazz.getDeclaredConstructor(new Class[] {String.class,int.class});
	   
	   Student stu=cons.newInstance(new Object[] {"����" ,23});
	   System.out.println(stu);
	   
	   //Ϊ��ʵ�������񷽷�java.lang.Class��һ�� newinstance �������ò��������Ĺ��췽��
	   
	   
	   Student stu1=(Student)clazz.newInstance();//���ò��������Ĺ��췽��
	   System.out.println(stu1);
	   
	   
	}

}
