package com.part01;
/**
 *ʵ�ֵĽӿ� 
 * ����
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		Class clazz=String.class;
		
		Class[] allinter=clazz.getInterfaces();
		for(Class c:allinter)
		{
			System.out.println(c);
		}
		
		Class superc=clazz.getSuperclass();
		System.out.println(superc);
		
	}

}
