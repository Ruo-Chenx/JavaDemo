package com.part5;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * Treesetʵ����SotedSet��һ�������Set��Ĭ��������Ȼ������
  * ����TeeSet �е�ÿ��Ԫ�أ�����ʵ�� java.lang.Comparable�ӿ�
 * @author Administrator
 *
 */
public class Demo04 {
    static class Stu implements Comparable<Stu>
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
		
		
		@Override
		public int compareTo(Stu o) {
			
			//return this.age>o.age?1:(this.age==o.age?0:-1);
			return -1*this.getName().compareTo(o.getName());
		}
		
		
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
	
	public static void main(String[] args)
	{
		Stu s1=new Stu("lisa",23);
		Stu s2=new Stu("ali",24);
		Stu s3=new Stu("Jack",26);
		Stu s4=new Stu("dali",29);
		Stu s5=new Stu("lisa",23);
		

		
	    Set<Stu> set=new TreeSet<Stu>();
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
