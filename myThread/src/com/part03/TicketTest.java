package com.part03;
/*
 *  模拟火车站售票
 * 
 */
public class TicketTest {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("窗口1");
		Thread t2 = new Thread(tt);
		t2.setName("   窗口2");
		Thread t3 = new Thread(tt);
		t3.setName("             窗口3");
		
		t.start();
		t2.start();
		t3.start();
	}
}






