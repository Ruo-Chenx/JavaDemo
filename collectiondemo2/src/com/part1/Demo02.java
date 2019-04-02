package com.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;

/**
 * java.util.Collection  集合框架的根接口，封装了管理对象的基础方法
 * java.util.List  是Collection子接口，以索引的方式管理对象
 * java.util.Set   是Collection子接口，以hashCode为key管理对角  不能存放重复的对象
 * java.util.Map   key=value 的数据结构
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
