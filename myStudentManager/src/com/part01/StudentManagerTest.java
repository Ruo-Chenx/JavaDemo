package com.part01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 这是我的学生管理系统的主类
 * 
 * 步骤：
 * A:定义学生类
 * B:学生管理系统的主界面的代码编写
 * C:学生管理系统的查看所有学生的代码编写
 * D:学生管理系统的添加学生的代码编写
 * E:学生管理系统的删除学生的代码编写
 * F:学生管理系统的修改学生的代码编写
 */
public class StudentManagerTest {
	public static void main(String[] args) {
		//创建集合对象,用于存储学生数据
		ArrayList<Student> array = new ArrayList<Student>();
		
		//为了让程序能回到这里来,我们使用循环
		while(true)
		{
			//这是学生管理系统的主界面
			System.out.println("--------欢迎来到学生管理系统--------");
			System.out.println("1查看所有学生");
			System.out.println("2添加学生");
			System.out.println("3删除学生");
			System.out.println("4修改学生");
			System.out.println("5退出");
			System.out.println("请输入你的选择：");
			//创建键盘录入对象
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			//用switch语句是按选择
			switch(choiceString)
			{
			case "1":
				//查看所有学生
				findAllStudent(array);
				break;
			case "2":
				//添加学生
				addStudent(array);
				break;
			case "3":
				//删除学生
				deleteStudent(array);
				break;
			case "4":
				//修改学生
				updataStudent(array);
				break;
			case "5":
				//退出
				//System.out.println("谢谢你的使用");
				//break;
			default:
				System.out.println("谢谢你的使用");
				System.exit(0);//JVM退出
				break;
				
			}
		}
	}
	
	//查看所有学生
	public static void findAllStudent(ArrayList<Student> array)
	{
		if(array.size() == 0)
		{
			System.out.println("不好意思,目前没有学生信息可供提供,请回去重新选择你的操作.");
			return ;
		}
		
		System.out.println("学号\t姓名\t年龄\t居住地");
		for(int i=0; i<array.size() ;i++)
		{
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//添加学生
	public static void addStudent(ArrayList<Student> array)
	{
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true)
		{
			System.out.println("请输入学生学号：");
			id = sc.nextLine();
			
			//判断学号有没有被人占用
			boolean flag = false;
			for(int i=0; i<array.size(); i++)
			{
				Student s = array.get(i);
				if(s.getId().equals(id))
				{
					flag = true;
					break;
				}
			}
			
			if(flag) {
				System.out.println("你输入的学号已经被占用,请重新输入！");
			}else {
				break;
			}
		}
		

		System.out.println("请输入学生姓名：");
		String name = sc.nextLine();
		System.out.println("请输入学生年龄：");
		String age = sc.nextLine();
		System.out.println("请输入学生居住地：");
		String address = sc.nextLine();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		System.out.println("添加学生成功");
	}
	
	//删除学生
	public static void deleteStudent(ArrayList<Student> array)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要删除学生的学号:");
		String id = sc.nextLine();
		int index = -1;
		
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1)
		{
			System.out.println("不好意思,你要删除的学号对应的学生信息不存在，请回去重新你的选择");
		}else {
			array.remove(index);
		}
		
		System.out.println("删除学生成功！");
	}
	
	
	//修改学生
	public static void updataStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入你要修改学生的学号：");
		String id = sc.nextLine();
		
		int index = -1;
	
		for (int i = 0; i < array.size(); i++) {
			Student s = array.get(i);
			
			if(s.getId().equals(id)) {
				index = i;
				break;
			}
		}
		if(index == -1)
		{
			System.out.println("不好意思,你要修改的学号对应的学生信息不存在，请回去重新你的选择");
		}else {
			System.out.println("请输入学生的新姓名：");
			String name = sc.nextLine();
			System.out.println("请输入学生的新年龄：");
			String age = sc.nextLine();
			System.out.println("请输入学生的新居住地");
			String address = sc.nextLine();
			
			Student s = new Student();
			s.setId(id);
			s.setAge(age);
			s.setName(name);
			s.setAddress(address);
			
			array.set(index, s);
			
			System.out.println("修改成功");
		}
		
	}
	
	
	
}
