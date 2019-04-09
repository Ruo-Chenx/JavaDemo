package com.part03;
/**
 * 接口就是一种特别的抽像类
 * 接口中的方法都是public的
 * 接口中的方法都是抽像的
 * 接口中的方法默认权限为public abstract
 * 接口中的成员默认权限为 public static final
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
