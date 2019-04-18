package com.part02.statproxy;
/**
 * 接口的代理类
 * 不改变原接口实现类的情况下，就可以对接口的功能进行需求变更
 * @author Administrator
 *
 */
public class EmailProxy implements Email {

	Email email;
	public EmailProxy(Email email)
	{
		this.email=email;
	}
	@Override
	public void send() {

		    System.out.println("发送邮件前准备。。。");
            email.send();
            System.out.println("发送后。。。。。。");
	}

	@Override
	public void revieve() {
		 
		//email.revieve();
		System.out.println("邮件转存手机....");
	}

}
