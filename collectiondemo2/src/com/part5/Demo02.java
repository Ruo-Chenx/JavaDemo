package com.part5;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * hashcode 
 * Object����int hashCode() ,,�������ж���hashCode
 * �Զ���Ĺؼ���Ϊ�ؼ��֣�ͨ��һ���㷨���������
 * ֻҪû����дhashCode()������������������ò�ͬ��ͬ�ģ���ôhashcode�Ͳ�ͬ
 * ��û����дhashCode()��ǰ���£���������ͬͬһ��������ôhashcode�Ͳ���ͬ
 * 
 * ��ͬ����ָ����������� hashcode ��ͬ������equalsΪtrue
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
