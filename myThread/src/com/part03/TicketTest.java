package com.part03;
/*
 *  ģ���վ��Ʊ
 * 
 */
public class TicketTest {

	public static void main(String[] args) {
		TicketThread tt = new TicketThread();
		
		Thread t = new Thread(tt);
		t.setName("����1");
		Thread t2 = new Thread(tt);
		t2.setName("   ����2");
		Thread t3 = new Thread(tt);
		t3.setName("             ����3");
		
		t.start();
		t2.start();
		t3.start();
	}
}






