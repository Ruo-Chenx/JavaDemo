package com.part02;
/*
 *  创建线程的另一种方法是声明实现 Runnable 接口的类。该类然后实现 run 方法。
 * 
 *  Thread(Runnable target)
 *  static Thread currentThread()  
 */
public class MyThread implements Runnable {
	int num;
	
	public MyThread(int num) {
		this.num = num;
	}
	@Override
	public  void run() {
		for (int i = 0; i < 100; i++) {
			//Thread t = Thread.currentThread();
			//System.out.println(t.getName()+":"+i);
			
			//链式编程
			System.out.println(Thread.currentThread().getName()+":"+i+":"+num);
		}
	}

	
}
