package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo10 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
			
			
			PreparedStatement ps=con.prepareStatement("select * from emp where id>?");
            ps.setInt(1,2);
			
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				System.out.println(rs.getInt("id")+"\t"+rs.getString("name")+"\t"+rs.getInt("age"));
			}		
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
