package com.part2;

import java.util.List;
import java.util.Vector;
/**
 * Vector也是List的实现类，
*java.util.ArrayList;     线程不安全的
*java.util.Vector;  线程安全的
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
