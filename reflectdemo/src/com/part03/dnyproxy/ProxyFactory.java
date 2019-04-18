package com.part03.dnyproxy;

import java.lang.reflect.Proxy;

/**
 * 工厂类
 * 不改变原接口实现类，就可以对接口实现类的功能进行功能变更
 * @author Administrator
 *
 */
public class ProxyFactory
{
/**
 * 为原始对像生成代理对象
 * @param org
 * @return
 */
	   public static Object getProxy(Object org)
	   {
		   //定义了将要生成的代理对像访问原始对像的方法模版
		   MyInvocatoin myin=new MyInvocatoin(org);
		   //为原始对像生成代理对象
		   return Proxy.newProxyInstance(org.getClass().getClassLoader(), org.getClass().getInterfaces(), myin);
		   
	   }
}
