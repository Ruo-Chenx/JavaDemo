package com.part02.statproxy;
/**
 * �ӿڵĴ�����
 * ���ı�ԭ�ӿ�ʵ���������£��Ϳ��ԶԽӿڵĹ��ܽ���������
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

		    System.out.println("�����ʼ�ǰ׼��������");
            email.send();
            System.out.println("���ͺ󡣡���������");
	}

	@Override
	public void revieve() {
		 
		//email.revieve();
		System.out.println("�ʼ�ת���ֻ�....");
	}

}
