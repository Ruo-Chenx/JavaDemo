package com.part2;

import java.util.ArrayList;
import java.util.List;
/**
 * 集合框架有什么用。。。。
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) {

       List list=new ArrayList();
       for(int i=0;i<10;i++)
       {
       Stu st=new Stu("stu"+i,20+10%(i+1));
       list.add(st);
       }
       
       for(int i=0;i<list.size();i++)
       {
    	   Stu s=(Stu)list.get(i);
    	   System.out.println(s);
       }

	}
	
	
	static class Stu
	{
		String name;
		int age;
		public Stu() {} 
		public Stu(String name,int age) {this.age=age;this.name=name;}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "*"+name+"::"+age+"*";
		}
		
	}

}
