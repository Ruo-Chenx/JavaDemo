package com.part1;

import java.util.Date;

/**
 * 1��ʲô��java�еļ��Ͽ��
 *    javaд�˺ܶ����Ľӿڣ���Щ����������ڹ���һ��������⣬
 *    ���ǰ�java�й����������м��Ͽ�ܣ�
 *    ��java.util.* 
 *    
 *     �����ǵ�Demo01����һ�����������ԼӶ�����Ҳ��ɾ����
 *     
 *     ��������������Ķ���
 * @author Administrator
 *
 */
public class Demo01
{
	Object [] data=new Object[10];
	int index=0;
	
	
	public void add(Object o)
	{
		data[index++]=o;
	}
	
	public Object removeLast()
	{
		return data[--index];
	}
	

	public static void main(String[] args) 
	{
		Demo01 d1=new Demo01();
		d1.add("hello");
		d1.add(new Date());
		d1.add(123);
		
		System.out.println(d1.removeLast());
		System.out.println(d1.removeLast());
		System.out.println(d1.removeLast());
		
	}

}
