package com.part03;
/*
 * synchronized: ͬ��(��)���������δ����ͷ���,�����εĴ����ͷ���һ����ĳ���̷߳���,��ֱ����ס,�����߳̽��޷�����
 * 
 * ͬ��������ʹ��synchronized���εķ���,һ����һ���̷߳���,��ֱ����ס�������߳̽��޷�����.
 * 
 * ע��:
 * 		�Ǿ�̬ͬ����������������this
 * 		��̬��ͬ���������������ǵ�ǰ����ֽ������
 * 
 * 
 */
public class TicketThread implements Runnable{
	static int tickets = 100;//��Ʊ������
	Object obj = new Object();
	
	@Override
	public void run() {
		while(true) {
			/*synchronized (obj) {
				method();
			}*/
			method();
		}
	}

	private static synchronized void method() {
		if(tickets > 0) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + ":" + tickets--);
		}
	}
	
}
