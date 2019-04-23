package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo08 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		    Statement stat=con.createStatement();
		    int dep_id=2;
		    int age=23;
		    String name="wang'wu";
		    String sex="M";
		    
		    String sql="insert into emp(dep_id,name,age,sex) values("+dep_id+",'"+name+"',"+age+",'"+sex+"')";
		    //insert into emp(dep_id,name,age,sex) values(2,'wang'wu',23,'m')
		    int re=stat.executeUpdate(sql);
			System.out.println(re);
			
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
