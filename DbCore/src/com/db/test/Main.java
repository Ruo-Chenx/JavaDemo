package com.db.test;

import java.sql.SQLException;
import java.util.Date;

import com.db.core.Db;

public class Main {
	public static void main(String[] args) throws SQLException {
	 /*   Student stu=new Student();
	    stu.setAge(23);
	    stu.setName("lisa");
	    stu.setMoney(BigDecimal.valueOf(23.45));
	    stu.setSex("M");

	    Db.add(stu);*/
		
		Article art=new Article();
		art.setAuthor("李四");
		art.setCtime(new Date());
		art.setTitle("这是标题");
		art.setTxt("这是内容");
		
		Db.add(art);
	    
	}

}
