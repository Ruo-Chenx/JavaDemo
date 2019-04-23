package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;

public class Demo18 {

	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
	    Statement stat=con.createStatement();
	    ResultSet rs=stat.executeQuery("select * from emp");
	    //µÃµ½ResultSetMetaData
	    ResultSetMetaData rmd=rs.getMetaData();
	    int colCount=rmd.getColumnCount();
	    
	    while(rs.next())
	    {
	    	for(int i=0;i<colCount;i++)
	    	{
	    		int type=rmd.getColumnType(i+1);
	    		String name=rmd.getColumnName(i+1);
	    		switch (type) {
				case java.sql.Types.INTEGER:
				case java.sql.Types.TINYINT:
				case java.sql.Types.BIGINT:
					System.out.print(rs.getInt(name)+"\t");
					break;
				case java.sql.Types.VARCHAR:
				case java.sql.Types.CHAR:
			        System.out.print(rs.getString(i+1)+"\t");
                     break;
				default:
					System.out.print(rs.getObject(i+1)+"\t");
					break;
				}
	    		
	    	}
	    	System.out.print("\n");
	    }
	    
	    
	    
	}

}
