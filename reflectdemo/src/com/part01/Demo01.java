package com.part01;
/**
   * ʲô�Ƿ��䣺
 * java�еķ�����ָ������ʱ�����Կز��ֽ����  ��Ա����   ��Ա����  �ӿ�  ���췽����ʵ���Զ��󣬵���������Ա
 * 
 * javaִ�еĹ��̣�
 * step1:java Hello  ���ֽ��������ڴ�
 * step2:���
 * step3:Ϊÿ���ֽ�������һ������java.lang.Class
 * step4:��ʼ����̬����飬��̬����
 * step5��ִ����ڷ���main
 * @author Administrator
 *
 */
public class Demo01 {
	
	//��εõ�java.lang.Class ����
	public static void main(String[] args) throws ClassNotFoundException 
	{
		//����һ
		 Class<String> clazz1=String.class;
		 Class<Demo01> clazz2=Demo01.class;
		 System.out.println(clazz1+"--->"+clazz2);
		//������
		 Demo01 d1=new Demo01();
		 String s1=new String("abc");
		 Class clazz3=d1.getClass();
		 Class clazz4=s1.getClass();
		 
		 //������
		 Class clazz5=Class.forName("java.lang.String");
		 Class clazz6=Class.forName("java.awt.Color");
		 
		 
		 //������   ��������
		 Class clazz7=int.class;
		 Class clazz8=Integer.TYPE;//�������� ��Ӧ�İ�װ�࣬����һ��TYPE��Ա
		 
		 Class clazz9=Integer.class;
		 Class clazz10=Class.forName("java.lang.Integer");
		 
		 System.out.println(clazz7==clazz8);
		 System.out.println(clazz7==clazz9);
		 System.out.println(clazz10==clazz9);
	}

}
