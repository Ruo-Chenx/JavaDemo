package com.part02;

public class ThreadDemo4 {
	public static void main(String[] args) {
		//�����߳�ʵ��
		MyThread mt =new MyThread(100);
		Thread t = new Thread(mt);
		t.setName("����");
		//�����߳�
		t.start();
		
		
		//MyThread mt2 =new MyThread();
	    Thread t2 = new Thread(mt);
	    t2.setName("����");
		
		t2.start();
	}
		
}
