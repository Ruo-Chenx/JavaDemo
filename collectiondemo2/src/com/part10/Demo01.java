package com.part10;
/**
 * 泛型其实就是类、接口、的参数（不能是基本类型）
 * 始果我们定义的类中，有些类型不确定时，可以用参数，也就是泛型
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
