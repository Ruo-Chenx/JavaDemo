package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class Demo06 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		    Statement stat=con.createStatement();
            String sql1="create table dep(id int not null auto_increment primary key,name varchar(25))";
            String sql2="create table emp(id int not null auto_increment primary key,dep_id int,name varchar(25),age int(2),sex enum('M','F') default 'M')";
            String sql3="insert into dep(name) values('生产')";
            String sql4="insert into dep(name) values('销售')";
            String sql5="insert into dep(name) values('人事')";
            
            String name="lisi";
            int age=23;
            String sex="F";
            int dep_id=3;
		    
            String sql6="insert into emp(dep_id,name,age,sex) values("+dep_id+",'"+name+"',"+age+",'"+sex+"')";
		    String sql7="insert into emp(dep_id,name,age) values(2,'张三',26)";
		    
		    
		    stat.addBatch(sql1);
		    stat.addBatch(sql2);
		    stat.addBatch(sql3);
		    stat.addBatch(sql4);
		    stat.addBatch(sql5);
		    stat.addBatch(sql6);
		    stat.addBatch(sql7);
		    
		    int [] all=stat.executeBatch();
		    System.out.println(Arrays.toString(all));
			
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
