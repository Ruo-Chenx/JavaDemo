package com.part01;

public class ThreadDemo01 {

	public static void main(String[] args) {
		//�����߳�ʵ��
		MyThread mt = new MyThread();
		
		mt.setName("����");
		//�����߳�
		mt.start();
		
		MyThread mt2 = new MyThread();
		mt2.setName("����");
		mt2.start();
	}
	
}
