package com.iss;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo12 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		    
			CallableStatement call=con.prepareCall("call add_emp(?,?,?,?,?)");
			//传出的参数要注册
			call.registerOutParameter(5, java.sql.Types.INTEGER);
			//传入的数参
			call.setString(1, "evan");
			call.setInt(2, 3);
			call.setInt(3, 23);
			call.setString(4,"F");
			
			call.execute();
			
			int re=call.getInt(5);
			System.out.println(re);
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
