package com.iss;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo27 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		Emp emp=run.query(con, "select * from emp where id>?",new BeanHandler<Emp>(Emp.class),3);
		
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getAge());
		
		
		
	}
  
}
