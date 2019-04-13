package com.part02;

public class ThreadDemo4 {
	public static void main(String[] args) {
		//创建线程实例
		MyThread mt =new MyThread(100);
		Thread t = new Thread(mt);
		t.setName("李四");
		//启动线程
		t.start();
		
		
		//MyThread mt2 =new MyThread();
	    Thread t2 = new Thread(mt);
	    t2.setName("老王");
		
		t2.start();
	}
		
}
