package com.part2;

import java.util.LinkedList;
import java.util.List;

/**
 * java.util.LinkedListҲ��List��ʵ����
 * 
 * LinkedList�ĺ� ������˫����ʵ�֣�   Node   
 * ����Ƶ���ز���
 * @author Administrator
 *
 */
public class Demo06 {

	

		public static void main(String[] args) {
			// TODO Auto-generated method stub

			
			List list=new LinkedList();
			list.add("1");
			list.add(2);
			list.add(new Object());
			
			list.add(0,new Exception());
			
			list.remove(1);
			list.remove(0);
			
			for(Object o:list)
				System.out.println(o);
		}


}
