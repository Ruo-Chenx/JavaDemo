package com.part03;
/**
 * �ӿھ���һ���ر�ĳ�����
 * �ӿ��еķ�������public��
 * �ӿ��еķ������ǳ����
 * �ӿ��еķ���Ĭ��Ȩ��Ϊpublic abstract
 * �ӿ��еĳ�ԱĬ��Ȩ��Ϊ public static final
 * @author Administrator
 *
 */
public interface Inter01 {
	int i=10;
	void m1();
}
interface Inter02
{
	void m2();
}
interface Inter03 extends Inter01,Inter02
{
	void m3();
}
interface Inter04
{
   public void m4();	
}
