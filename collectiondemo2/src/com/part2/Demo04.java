package com.part2;

import java.util.ArrayList;
import java.util.List;

/**
 * java.util.AbstractList extends AbstracCollection 
 * java.util.ArrayList extends AbstractList implements List
 * ArrayList��List��õ�һ��ʵ���࣬���� �ľ����Զ�����������������
 * 
 * ArrayList���ʺ�Ƶ���ı�Ԫ�أ���������˳�����
 * @author Administrator
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		List list=new ArrayList();
		list.add("1");
		list.add(2);
		list.add(new Object());
		
		list.add(0,new Exception());
		
		list.remove(1);
		list.remove(0);
	}

}
