package com.part02;
/*
 *  �����̵߳���һ�ַ���������ʵ�� Runnable �ӿڵ��ࡣ����Ȼ��ʵ�� run ������
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
			
			//��ʽ���
			System.out.println(Thread.currentThread().getName()+":"+i+":"+num);
		}
	}

	
}
