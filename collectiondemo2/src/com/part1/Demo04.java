package com.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 *java.util.Iterator  ��һ�������� 
 *
 *
 */
public class Demo04 {

	public static void main(String[] args) {
		
		Collection con=new ArrayList();
		con.add("hello");
		con.add("lisi");
		con.add(new Date());
		con.add(false);
		
	   Iterator it=con.iterator();
	   while(it.hasNext())
	   {
		   System.out.println(it.next());
		   it.remove();//ɾ���ո��ó����Ķ���
	   }
	   System.out.println("-----------------------");
	   
	   System.out.println(Arrays.toString(con.toArray()));

	}

}
