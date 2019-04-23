package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo09 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
			
			String sql="insert into emp(dep_id,name,age,sex) values(?,?,?,?)";
			PreparedStatement ps=con.prepareStatement(sql);
			
		    int dep_id=2;
		    int age=23;
		    String name="wang'wu";
		    String sex="M";
		    
		    ps.setInt(1, dep_id);
		    ps.setString(2, name);
		    ps.setInt(3, age);
		    ps.setString(4,sex);
		   
		    int re=ps.executeUpdate();  
		    
			System.out.println(re);
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
