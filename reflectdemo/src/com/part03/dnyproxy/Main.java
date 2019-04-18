package com.part03.dnyproxy;

public class Main {

	public static void main(String[] args) {
		//原始对象
		Email email=new FlashEmail();
		
	
		//根据原始对像生成代理对象
		Email proxy=(Email)ProxyFactory.getProxy(email);
		
		
		proxy.send();
		proxy.revieve();
	}

}
