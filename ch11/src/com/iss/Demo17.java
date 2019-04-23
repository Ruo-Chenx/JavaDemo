package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;

public class Demo17 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
	    Statement stat=con.createStatement();
	    ResultSet rs=stat.executeQuery("select * from emp");
	    //µÃµ½ResultSetMetaData
	    ResultSetMetaData rmd=rs.getMetaData();
	    int colCount=rmd.getColumnCount();
	    System.out.println(Types.INTEGER+"----------");
	    System.out.println(colCount);
	    for(int i=0;i<colCount;i++)
	    {
	    	String colName=rmd.getColumnName(i+1)+"\t"+rmd.getColumnLabel(i+1);
	    	System.out.println(colName+"\t"+rmd.getColumnType(i+1));
	    }

	}

}
