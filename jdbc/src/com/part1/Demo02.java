package com.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo02 {

	public static void main(String[] args) throws Exception 
	{

		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");
		   Statement stat=con.createStatement();
		   
		   String sql="select * from admin";		   
		   //只能发查询语句
		   ResultSet rs=stat.executeQuery(sql);
		   
		   while(rs.next()) 
		   {
			   System.out.println(rs.getInt(1)+"\t"+rs.getString("uname")+"\t"+rs.getString("name")+"\t"+rs.getString(3));
		   }
		   
		   con.close();
	}

}
