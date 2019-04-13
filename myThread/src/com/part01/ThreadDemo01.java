package com.part01;

public class ThreadDemo01 {

	public static void main(String[] args) {
		//创建线程实例
		MyThread mt = new MyThread();
		
		mt.setName("张三");
		//开启线程
		mt.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("老王");
		mt2.start();
	}
	
}
