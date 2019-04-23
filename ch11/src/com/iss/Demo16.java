package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class Demo16 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");

			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
		   
			Statement stat=con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
		   
		    ResultSet rs=stat.executeQuery("select * from emp");
		    //增加
		/*    rs.moveToInsertRow();
		    rs.updateInt("age", 24);
		    rs.updateInt("dep_id",3);
		    rs.updateString("name", "gogo");
		    rs.insertRow();*/
		    
		/*    rs.absolute(4);
		    rs.updateString("name", "王五");
		    rs.updateInt("age", 28);
		    rs.updateRow();*/
		    rs.absolute(9);
		    rs.deleteRow();
		
		    
		    
		    
			System.out.println("OK");
		} catch (ClassNotFoundException e) {
			 System.out.println("找不到驱动类");
		} catch (SQLException e) {
			 System.out.println("连接数据库失败");
			 e.printStackTrace();
		}

	}

}
