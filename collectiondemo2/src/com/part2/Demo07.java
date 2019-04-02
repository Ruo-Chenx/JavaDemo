package com.part2;

import java.util.LinkedList;
import java.util.List;
/**
 * 用LinkdList 构建队和栈
 * @author Administrator
 *
 */
public class Demo07 {

	public static void main(String[] args) 
	{
		 Eat eat=new Eat();
		 
		 eat.come("lisi");
		 eat.come("xa");
		 eat.come("cc");
		 
		 System.out.println(eat.eat());
		 System.out.println(eat.eat());
		 System.out.println(eat.eat());

	}
	
	
	static class Eat
	{
		private LinkedList list=new LinkedList();
		
		public void come(Object person)
		{
			list.addFirst(person);
		}
		
		public Object eat()
		{
			return list.removeLast();
		}
		
	}

}
