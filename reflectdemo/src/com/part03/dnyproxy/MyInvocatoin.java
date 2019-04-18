package com.part03.dnyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * java.lang.reflect.InvocationHandler�����˽�Ҫ���ɵĴ�����󣬷���ԭʼ���񷽷���ģ��
 * @author Administrator
 *
 */
public class MyInvocatoin implements InvocationHandler {

	private Object obj;//ԭʼ������ҪΪ���ԭʼ�������ɴ������
	
	public MyInvocatoin(Object obj)
	{
		this.obj=obj;
	}
	/**
	 * 
	 * @param proxy
	 * @param method   ԭʼ���񷽷�  
	 * @param args     ����������ʵ��
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object re=null;//ԭʼ�������ص�ֵ
		if("send".equals(method.getName()))
		{
			System.out.println("send log.......");
			re=method.invoke(obj, args);
			System.out.println("send log...end....");
		}else if("revieve".equals(method.getName()))
		{
			System.out.println("^_^");
		}else
		{

		//��ԭʼ����ǰ��������
		re=method.invoke(obj, args);//��ԭʼ����ķ���
		//��ԭʼ��������������
		}
		return re;
	}

}
