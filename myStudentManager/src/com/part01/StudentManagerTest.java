package com.part01;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * �����ҵ�ѧ������ϵͳ������
 * 
 * ���裺
 * A:����ѧ����
 * B:ѧ������ϵͳ��������Ĵ����д
 * C:ѧ������ϵͳ�Ĳ鿴����ѧ���Ĵ����д
 * D:ѧ������ϵͳ�����ѧ���Ĵ����д
 * E:ѧ������ϵͳ��ɾ��ѧ���Ĵ����д
 * F:ѧ������ϵͳ���޸�ѧ���Ĵ����д
 */
public class StudentManagerTest {
	public static void main(String[] args) {
		//�������϶���,���ڴ洢ѧ������
		ArrayList<Student> array = new ArrayList<Student>();
		
		//Ϊ���ó����ܻص�������,����ʹ��ѭ��
		while(true)
		{
			//����ѧ������ϵͳ��������
			System.out.println("--------��ӭ����ѧ������ϵͳ--------");
			System.out.println("1�鿴����ѧ��");
			System.out.println("2���ѧ��");
			System.out.println("3ɾ��ѧ��");
			System.out.println("4�޸�ѧ��");
			System.out.println("5�˳�");
			System.out.println("���������ѡ��");
			//��������¼�����
			Scanner sc = new Scanner(System.in);
			String choiceString = sc.nextLine();
			//��switch����ǰ�ѡ��
			switch(choiceString)
			{
			case "1":
				//�鿴����ѧ��
				findAllStudent(array);
				break;
			case "2":
				//���ѧ��
				addStudent(array);
				break;
			case "3":
				//ɾ��ѧ��
				deleteStudent(array);
				break;
			case "4":
				//�޸�ѧ��
				updataStudent(array);
				break;
			case "5":
				//�˳�
				//System.out.println("лл���ʹ��");
				//break;
			default:
				System.out.println("лл���ʹ��");
				System.exit(0);//JVM�˳�
				break;
				
			}
		}
	}
	
	//�鿴����ѧ��
	public static void findAllStudent(ArrayList<Student> array)
	{
		if(array.size() == 0)
		{
			System.out.println("������˼,Ŀǰû��ѧ����Ϣ�ɹ��ṩ,���ȥ����ѡ����Ĳ���.");
			return ;
		}
		
		System.out.println("ѧ��\t����\t����\t��ס��");
		for(int i=0; i<array.size() ;i++)
		{
			Student s = array.get(i);
			System.out.println(s.getId()+"\t"+s.getName()+"\t"+s.getAge()+"\t"+s.getAddress());
		}
	}
	
	//���ѧ��
	public static void addStudent(ArrayList<Student> array)
	{
		Scanner sc = new Scanner(System.in);
		String id;
		
		while(true)
		{
			System.out.println("������ѧ��ѧ�ţ�");
			id = sc.nextLine();
			
			//�ж�ѧ����û�б���ռ��
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
				System.out.println("�������ѧ���Ѿ���ռ��,���������룡");
			}else {
				break;
			}
		}
		

		System.out.println("������ѧ��������");
		String name = sc.nextLine();
		System.out.println("������ѧ�����䣺");
		String age = sc.nextLine();
		System.out.println("������ѧ����ס�أ�");
		String address = sc.nextLine();
		
		Student s = new Student();
		s.setId(id);
		s.setName(name);
		s.setAge(age);
		s.setAddress(address);
		
		array.add(s);
		System.out.println("���ѧ���ɹ�");
	}
	
	//ɾ��ѧ��
	public static void deleteStudent(ArrayList<Student> array)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫɾ��ѧ����ѧ��:");
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
			System.out.println("������˼,��Ҫɾ����ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ�������ѡ��");
		}else {
			array.remove(index);
		}
		
		System.out.println("ɾ��ѧ���ɹ���");
	}
	
	
	//�޸�ѧ��
	public static void updataStudent(ArrayList<Student> array) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��������Ҫ�޸�ѧ����ѧ�ţ�");
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
			System.out.println("������˼,��Ҫ�޸ĵ�ѧ�Ŷ�Ӧ��ѧ����Ϣ�����ڣ����ȥ�������ѡ��");
		}else {
			System.out.println("������ѧ������������");
			String name = sc.nextLine();
			System.out.println("������ѧ���������䣺");
			String age = sc.nextLine();
			System.out.println("������ѧ�����¾�ס��");
			String address = sc.nextLine();
			
			Student s = new Student();
			s.setId(id);
			s.setAge(age);
			s.setName(name);
			s.setAddress(address);
			
			array.set(index, s);
			
			System.out.println("�޸ĳɹ�");
		}
		
	}
	
	
	
}
