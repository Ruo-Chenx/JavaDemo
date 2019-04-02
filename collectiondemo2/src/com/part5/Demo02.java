package com.part5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * hashcode 
 * Object中有int hashCode() ,,所有类中都有hashCode
 * 以对象的关键字为关键字，通过一种算法求出的整数
 * 只要没有重写hashCode()方法，两个对象的引用不同相同的，那么hashcode就不同
 * 在没有重写hashCode()的前提下，两个对象不同同一个对象，那么hashcode就不相同
 * 
 * 相同对象指：两个对象的 hashcode 相同，并且equals为true
 * @author Administrator
 *
 */
public class Demo02 {
    static class Stu
    {
    	private int age;
    	private String name;
    	public Stu() {}
    	public Stu(String name,int age) {this.name=name;this.age=age;}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return "<<"+name+":"+age+">>";
		}
		
		public int 	hashCode()
		{
			return this.age+name.hashCode();
		}
		
		public boolean equals(Object obj)
		{
			return this==obj;
		}
    	
    }
	
	public static void main(String[] args)
	{
		Stu s1=new Stu("lisa",23);
		Stu s2=new Stu("ali",24);
		Stu s3=new Stu("Jack",26);
		Stu s4=new Stu("dali",29);
		Stu s5=new Stu("lisa",23);
		
		
		System.out.println(s1.hashCode()+"--"+s5.hashCode());
		System.out.println(s1.equals(s5));
		System.out.println(s1==s5);
		
	    Set<Stu> set=new HashSet<Stu>();
	    set.add(s1);
	    set.add(s2);
	    set.add(s3);
	    set.add(s4);
	    set.add(s5);
	    
	    Iterator<Stu> it=set.iterator();
        while(it.hasNext())
        {
        	//Stu stu=it.next();
        	System.out.println(it.next());
        }
	}

}
