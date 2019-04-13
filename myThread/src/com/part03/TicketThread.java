package com.part03;
/*
 * synchronized: 同步(锁)，可以修饰代码块和方法,被修饰的代码块和方法一旦被某个线程访问,则直接锁住,其他线程将无法访问
 * 
 * 同步方法：使用synchronized修饰的方法,一旦被一个线程访问,则直接锁住，其他线程将无法访问.
 * 
 * 注意:
 * 		非静态同步方法的锁对象是this
 * 		静态的同步方法的锁对象是当前类的字节码对象
 * 
 * 
 */
public class TicketThread implements Runnable{
	static int tickets = 100;//火车票的数量
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
