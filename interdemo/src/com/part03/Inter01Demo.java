package com.part03;
/**
 * ����ʵ�ֶ���ӿڣ�
 * �ӿڲ���ʵ��������
 * @author Administrator
 *
 */
public class Inter01Demo extends Inter01Imp implements Inter03, Inter04 {

	@Override
	public void m2() {
		// TODO Auto-generated method stub
        System.out.println("m2..");
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		  System.out.println("m4..");
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		  System.out.println("��д��m3............");
	}

	public static void main(String[] args) {

     Inter01 i1=new Inter01Imp();
     Inter02 i2=new Inter01Demo();
     Inter03 i3=new Inter01Demo();
     
     Inter04 i4=new Inter04() {

		@Override
		public void m4() {
			// TODO Auto-generated method stub
			System.out.println("^_^---");
		}};
     
		

		
		i1.m1();
		i2.m2();
		i3.m3();i3.m1();i3.m2();
		i4.m4();
	}

}
