package com.iss;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo20 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
	    
		//第一步，关闭自动提交事务
		con.setAutoCommit(false);//关闭自动提交事务的功能
		
	    Statement stat=con.createStatement();
	    Savepoint sv=con.setSavepoint("aaa");

	    
	    try {
			//从王五减了100
			stat.executeUpdate("update emp set balance=balance-100 where id=4");
		   
			//给lisa加上100
			stat.executeUpdate("update emp set balance=balance+100 where id=5");
		
			con.commit();
			
		} catch (Exception e) {
			 con.rollback();
			 con.rollback(sv);
			e.printStackTrace();
		}finally
	    {
			con.close();
	    }
	    
	    System.out.println("OK");
	    
	    
	}

}
