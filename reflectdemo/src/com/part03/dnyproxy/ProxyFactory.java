package com.part03.dnyproxy;

import java.lang.reflect.Proxy;

/**
 * ������
 * ���ı�ԭ�ӿ�ʵ���࣬�Ϳ��ԶԽӿ�ʵ����Ĺ��ܽ��й��ܱ��
 * @author Administrator
 *
 */
public class ProxyFactory
{
/**
 * Ϊԭʼ�������ɴ������
 * @param org
 * @return
 */
	   public static Object getProxy(Object org)
	   {
		   //�����˽�Ҫ���ɵĴ���������ԭʼ����ķ���ģ��
		   MyInvocatoin myin=new MyInvocatoin(org);
		   //Ϊԭʼ�������ɴ������
		   return Proxy.newProxyInstance(org.getClass().getClassLoader(), org.getClass().getInterfaces(), myin);
		   
	   }
}
