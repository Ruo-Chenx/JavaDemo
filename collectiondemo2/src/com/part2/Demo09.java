package com.part2;

import java.util.List;
import java.util.Vector;
/**
 * VectorҲ��List��ʵ���࣬
*java.util.ArrayList;     �̲߳���ȫ��
*java.util.Vector;  �̰߳�ȫ��
 * 
 * @author Administrator
 *
 */
public class Demo09 {

	public static void main(String[] args) {
		 List  list=new Vector();
	     
	     list.add("lisi");
	     list.add("zhangan");
	     list.add(0,"lisa");
	     list.add("jack");
	     list.add("rose");
	     
	     for(Object obj:list)
	     {
	    	 System.out.println(obj);
	     }
	}

}
