package com.part01;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * 
 * �Գ�Ա�Ĳ���
 * @author Administrator
 *
 */
public class Demo05 {

	public static void main(String[] args) throws Exception {
	 
		
		Class clazz=Class.forName("com.part01.Student");
		Student stu=(Student)clazz.newInstance();
		
		Field  all[]=clazz.getDeclaredFields();
		//getModifiers() �����ɸ� Field�����ʾ���ֶε�Java�������η�����Ϊ������
		for(Field f:all)
		{
			System.out.println(f+"::"+f.getType()+"::"+f.getModifiers()+":::"+Modifier.isPublic(f.getModifiers()));
		}
		System.out.println("---�õ�ָ��"
				+ ""
				+ "filed----------");
		
		Field fname=clazz.getDeclaredField("name");
		fname.setAccessible(true);//˽�г�Ա��ֵ
		
		fname.set(stu, "С��");//����Ա��ֵ
		System.out.println(stu);
		//���ó�Ա��ֵ
		Object re=fname.get(stu);//stu.getName()
		System.out.println(re);
		
	}

}
