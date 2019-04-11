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
		//1����������
	   Class.forName("com.mysql.jdbc.Driver");

	   
	   //2����������
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");
	   
	   /**
	    MS SQL2000:
					jdbc:microsoft:sqlserver://localhost:1433;databasename=dbname
					Oracle:
					jdbc:oracle:thin:@localhost:1521:ORCL
					MySQL:
					jdbc:mysql://localhost:3306/databasename
					JDBC-ODBC:
					jdbc:odbc:����Դ��
	    
	    
	    */
	   
	   System.out.println(con);
	   
	   //3���õ�������  ���ڸ�dbms��sql���
	   Statement stat=con.createStatement();
	   
	   String sql="insert into admin(uname,upwd,name) values('κ��','112334','С��')";
	   //4����dbms��sql   ddl update delete insert 
	   int re=stat.executeUpdate(sql);
	   System.out.println("re>>>"+re);
	   
	   con.close();
	}

}
