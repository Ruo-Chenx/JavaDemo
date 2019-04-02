package com.part4;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 怎么样才是相同的元素
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
    	
    }
	
	public static void main(String[] args)
	{
		Stu s1=new Stu("lisa",23);
		Stu s2=new Stu("ali",24);
		Stu s3=new Stu("Jack",26);
		Stu s4=new Stu("dali",29);
		Stu s5=new Stu("lisa",23);
		
		
		System.out.println(s1.hashCode()+"--"+s5.hashCode());
		System.out.println(s1.equals(s2));
		
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
