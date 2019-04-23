package com.iss;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Demo19 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
	    
		DatabaseMetaData  dmd=con.getMetaData();
	/*    ResultSet rs=dmd.getTables("bbb", null, null, null);
	    while(rs.next())
	    {
	    	System.out.println(rs.getString("TABLE_NAME"));
	    }
	    */
		
		ResultSet rs=dmd.getCatalogs();
		while(rs.next())
		{
			System.out.println(rs.getString("TABLE_CAT"));
		}
	    
	}

}
