package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Properties;

public class Demo11 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		    
		    String sql="insert into dep(name) values(?)";
		    PreparedStatement ps=con.prepareStatement(sql);
		    
		    ps.setString(1, "dep01");
		    ps.addBatch();
		    ps.setString(1,"dep02");
		    ps.addBatch();
		    
		    int []all=ps.executeBatch();
		    System.out.println(Arrays.toString(all));
			
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
