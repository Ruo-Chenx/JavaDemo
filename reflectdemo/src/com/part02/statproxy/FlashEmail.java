package com.part02.statproxy;

public class FlashEmail implements Email {

	@Override
	public void send() {
		// TODO Auto-generated method stub
            System.out.println("发送邮件。。。。。");
	}

	@Override
	public void revieve() {
		// TODO Auto-generated method stub
       System.out.println("收邮件..........");
	}

}
