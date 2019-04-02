package com.part5;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Treeset实现了SotedSet是一个有序的Set，默认是以自然序排列
 * 放入TeeSet 中的每个元素，必须实现 java.lang.Comparable接口
 * @author Administrator
 *
 */
public class Demo06 {
    static class Stu //implements Comparable<Stu>
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
			return this.hashCode()==obj.hashCode();
		}
		
		/*
		@Override
		public int compareTo(Stu o) {
			
			//return this.age>o.age?1:(this.age==o.age?0:-1);
			return -1*this.getName().compareTo(o.getName());
		}*/
		
		
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		

    }
    //单独定义的比较器
    static class StuComparetor implements Comparator<Stu>
    {

		@Override
		public int compare(Stu o1, Stu o2) {
			// TODO Auto-generated method stub
			return o1.getAge()>o2.getAge()?1:(o1.getAge()==o2.getAge()?0:-1);
		}
    	
    }
	
	public static void main(String[] args)
	{
		
		Stu[] stus=new Stu[] {
		new Stu("lisa",23),
		new Stu("ali",24),
		new Stu("Jack",26),
		new Stu("dali",29),
		new Stu("lisa",23),
		
		};
		 
		//对对象数据排序，要求对象数组中的每个元素也要实现在Compareable
		//Arrays.sort(stus);
		
		Arrays.sort(stus, new StuComparetor());
		for(Stu s:stus)
		{
			System.out.println(s);
		}
	}

}
