package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo02 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb?user=root&password=mysql");
			System.out.println(con);
			
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
