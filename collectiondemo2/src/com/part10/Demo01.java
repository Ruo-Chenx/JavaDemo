package com.part10;
/**
 * ������ʵ�����ࡢ�ӿڡ��Ĳ����������ǻ������ͣ�
 * ʼ�����Ƕ�������У���Щ���Ͳ�ȷ��ʱ�������ò�����Ҳ���Ƿ���
 * @author Administrator
 *
 */
public class Demo01<T> 
{
    T t;
    
    
	public T getT() {
		return t;
	}


	public void setT(T t) {
		this.t = t;
	}


	public static void main(String[] args) 
	{
		Demo01<Integer> d1=new Demo01<Integer>();
		d1.setT(20);
		Integer re=d1.getT();
		
		
		Demo01<String> d2=new Demo01<String>();
		d2.setT("hello");
		String re2=d2.getT();

	}

}
