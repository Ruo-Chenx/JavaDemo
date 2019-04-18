package com.part01;
/**
   * 什么是反射：
 * java中的反射是指在运行时，可以控测字节码的  成员变量   成员方法  接口  构造方法，实例对对象，调方法，成员
 * 
 * java执行的过程：
 * step1:java Hello  将字节码载入内存
 * step2:检查
 * step3:为每个字节码生成一个对象java.lang.Class
 * step4:初始化静态代码块，静态变量
 * step5：执行入口方法main
 * @author Administrator
 *
 */
public class Demo01 {
	
	//如何得到java.lang.Class 对象
	public static void main(String[] args) throws ClassNotFoundException 
	{
		//方法一
		 Class<String> clazz1=String.class;
		 Class<Demo01> clazz2=Demo01.class;
		 System.out.println(clazz1+"--->"+clazz2);
		//方法二
		 Demo01 d1=new Demo01();
		 String s1=new String("abc");
		 Class clazz3=d1.getClass();
		 Class clazz4=s1.getClass();
		 
		 //方法三
		 Class clazz5=Class.forName("java.lang.String");
		 Class clazz6=Class.forName("java.awt.Color");
		 
		 
		 //方法四   基本类型
		 Class clazz7=int.class;
		 Class clazz8=Integer.TYPE;//基本类型 对应的包装类，都有一个TYPE成员
		 
		 Class clazz9=Integer.class;
		 Class clazz10=Class.forName("java.lang.Integer");
		 
		 System.out.println(clazz7==clazz8);
		 System.out.println(clazz7==clazz9);
		 System.out.println(clazz10==clazz9);
	}

}
