package com.part02.statproxy;

public class Main {

	public static void main(String[] args) {
		//原始对象
	   Email email=new FlashEmail();
	  
	   //接口的代理类
	   EmailProxy ep=new EmailProxy(email);
	   
	   ep.send();
	   ep.revieve();

	}

}
