package com.part02.statproxy;

public class Main {

	public static void main(String[] args) {
		//ԭʼ����
	   Email email=new FlashEmail();
	  
	   //�ӿڵĴ�����
	   EmailProxy ep=new EmailProxy(email);
	   
	   ep.send();
	   ep.revieve();

	}

}
