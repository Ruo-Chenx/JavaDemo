package com.part3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Savepoint;
import java.sql.Statement;

public class Demo01 {

	public static void main(String[] args)throws Exception {
		  
		Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");
        Statement ps=con.createStatement();
        con.setAutoCommit(false);//关闭自动提交事务
        
   //  Savepoint sp=null;  
        
        try {
        	//事务de代码段
		    ps.executeUpdate("update person set age=age-5 where id=2");
		   
		    //sp= con.setSavepoint("abc");
		   
		    ps.executeUpdate("update person set age=age+5 where id=1");
		    
		    con.commit();//提交事务
        	
        	
		} catch (Exception e) 
        {
			//con.rollback(sp);
			con.rollback();
			e.printStackTrace();
		}
        System.out.println("OK");
        
	}

}
