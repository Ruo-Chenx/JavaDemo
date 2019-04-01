package com.part02;

import java.lang.annotation.Annotation;
import java.lang.annotation.Documented;
import java.util.Arrays;

//ע��������  {}

@Author(name="lisi",age=23,emails= {"aa@qq.com","bbb@qq.com"})
public class Demo01 {
	
	public static void main(String[] args) 
	{
		Class clazz=Demo01.class;
		
		/*Annotation[] all=clazz.getAnnotations();
		for(Annotation ano:all)
		{
			System.out.println(ano);
		}
*/
		
		//������������� Annotation   Author
		Annotation ano=clazz.getAnnotation(Author.class);
		if(ano instanceof Author)
		{
			Author au=(Author)ano;
			System.out.println(au.age());
			System.out.println(au.name());
			System.out.println(Arrays.toString(au.emails()));
		}
	}

}
