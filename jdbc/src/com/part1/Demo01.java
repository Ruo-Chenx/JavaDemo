package com.part1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Demo01 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		/**
		 *
		 * MSSQL:
					com.microsoft.jdbc.sqlserver.SQLServerDriver
					ORACLE:oracle.jdbc.driver.OracleDriver
					MYSQL:com.mysql.jdbc.Driver
					JDBC-ODBC:sun.jdbc.odbc.JdbcOdbcDriver
		 */
		//1、加载驱动
	   Class.forName("com.mysql.jdbc.Driver");

	   
	   //2、连接数据
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");
	   
	   /**
	    MS SQL2000:
					jdbc:microsoft:sqlserver://localhost:1433;databasename=dbname
					Oracle:
					jdbc:oracle:thin:@localhost:1521:ORCL
					MySQL:
					jdbc:mysql://localhost:3306/databasename
					JDBC-ODBC:
					jdbc:odbc:数据源名
	    
	    
	    */
	   
	   System.out.println(con);
	   
	   //3、得到语句对象  用于给dbms发sql语句
	   Statement stat=con.createStatement();
	   
	   String sql="insert into admin(uname,upwd,name) values('魏佳','112334','小明')";
	   //4、给dbms发sql   ddl update delete insert 
	   int re=stat.executeUpdate(sql);
	   System.out.println("re>>>"+re);
	   
	   con.close();
	}

}
