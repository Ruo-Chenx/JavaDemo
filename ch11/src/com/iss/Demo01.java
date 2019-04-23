package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo01 {

	public static void main(String[] args) throws Exception
	{
		  Class.forName("oracle.jdbc.driver.OracleDriver");
		  
		  String url="jdbc:oracle:thin:@192.168.149.10:1521:orcl";
		  Connection con=DriverManager.getConnection(url,"scott","admin");
		  Statement stata=con.createStatement();
		//  stata.executeUpdate("create table t1(f1 number,f2 number)");
		int re=  stata.executeUpdate("insert into t1(f1,f2) values(120,220)");
		 System.out.println("OK"+re);

	}

}
