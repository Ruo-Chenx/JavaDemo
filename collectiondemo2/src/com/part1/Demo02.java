package com.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * java.util.Collection  ���Ͽ�ܵĸ��ӿڣ���װ�˹������Ļ�������
 * java.util.List  ��Collection�ӽӿڣ��������ķ�ʽ�������
 * java.util.Set   ��Collection�ӽӿڣ���hashCodeΪkey����Խ�  ���ܴ���ظ��Ķ���
 * java.util.Map   key=value �����ݽṹ
 * @author Administrator
 *
 */
public class Demo02 {

	public static void main(String[] args) {
		
		Collection con=new ArrayList();
		con.add("hello");
		con.add("lisi");
		con.add(new Date());
		con.add(false);
		
		
		System.out.println(con.size());
		System.out.println(con.contains("lisi"));
		System.out.println(con.isEmpty());
		
		Object[] re=con.toArray();
		re[0]=12;
		System.out.println(Arrays.toString(re));

	}

}
