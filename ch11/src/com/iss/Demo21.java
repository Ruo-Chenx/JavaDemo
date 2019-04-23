package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo21 {

	
	public static void main(String[] args) throws Exception
	{

	      Connection cons[]=new Connection[10];
		
				Class.forName("com.mysql.jdbc.Driver");
				
				
				for(int i=0;i<10;i++)
				{
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb","root","mysql");
				    cons[i]=con;
				 }
			Thread.sleep(10000);
			
		

	}

}
