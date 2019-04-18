package com.part01;

public class SingleTon 
{
     private static SingleTon  st=null;
	
	 private SingleTon() {}
	 
	 public static SingleTon newInstance()
	 {
		 if(null==st)
			 st=new SingleTon();
		 
		 return st;
	 }
	
	 
	 public static Student stuFactory()
	 {
		 return new Student();
	 }
	
	public static void main(String[] args)
   {
		SingleTon s1=SingleTon.newInstance();
		SingleTon s2=SingleTon.newInstance();
		System.out.println(s1);
		System.out.println(s2);
		
		
		Student stu=SingleTon.stuFactory();
		System.out.println(stu);
	}

}
