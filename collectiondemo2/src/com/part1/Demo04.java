package com.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

/**
 *java.util.Iterator  是一个迭代器 
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
		   it.remove();//删掉刚刚拿出来的对象
	   }
	   System.out.println("-----------------------");
	   
	   System.out.println(Arrays.toString(con.toArray()));

	}

}
