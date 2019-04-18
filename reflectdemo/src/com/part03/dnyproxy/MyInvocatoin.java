package com.part03.dnyproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/**
 * java.lang.reflect.InvocationHandler定义了将要生成的代理对象，访问原始对像方法的模版
 * @author Administrator
 *
 */
public class MyInvocatoin implements InvocationHandler {

	private Object obj;//原始对像，我要为这个原始对像生成代理对象
	
	public MyInvocatoin(Object obj)
	{
		this.obj=obj;
	}
	/**
	 * 
	 * @param proxy
	 * @param method   原始对像方法  
	 * @param args     调方法传的实参
	 * @return
	 * @throws Throwable
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
	{
		Object re=null;//原始方法返回的值
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

		//调原始方法前做的事情
		re=method.invoke(obj, args);//调原始对象的方法
		//调原始方法后做的事情
		}
		return re;
	}

}
