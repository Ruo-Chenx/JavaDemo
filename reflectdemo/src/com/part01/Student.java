package com.part01;

public class Student {

   private int age;
   public static  String name;
   public Student() 
   {
	   this.name="lisa";
	   this.age=20;
   }
   
   public Student(String name,int age) {
	   this.name=name;
	   this.age=age;
   }
   
    private Student(int age) {}
   
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
	
	@Override
	public String toString() {
		
		return "["+name+":"+age+"]";
	}
  
}
