package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo14 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		    Statement stat=con.createStatement();
		    ResultSet rs=stat.executeQuery("select e.id,d.name as dname,e.name,e.age from emp e,dep d where d.id=e.dep_id");
		   while(rs.next())
		   {
		    System.out.println(rs.getInt("id")+"\t"+rs.getString("dname")+"\t"+rs.getString(3)+"\t"+rs.getInt("age"));	
		   }
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
