package com.part03.dnyproxy;

public class Main {

	public static void main(String[] args) {
		//ԭʼ����
		Email email=new FlashEmail();
		
	
		//����ԭʼ�������ɴ������
		Email proxy=(Email)ProxyFactory.getProxy(email);
		
		
		proxy.send();
		proxy.revieve();
	}

}
