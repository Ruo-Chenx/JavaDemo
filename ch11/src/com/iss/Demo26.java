package com.iss;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo26 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		List<Emp> list=run.query(con, "select * from emp where id>?",new BeanListHandler<Emp>(Emp.class),3);
		
		for(Emp emp:list)
		{
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getAge());
		}
		
		
	}
  
}
