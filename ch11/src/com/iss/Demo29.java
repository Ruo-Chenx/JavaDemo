package com.iss;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo29 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		//ResultSet的每一行数据以对象数组返回
		List<Object[]> all=run.query(con, "select * from emp where id>?",new ArrayListHandler(),3);
		  for(Object[] row:all)
			System.out.println(row[0]+"\t"+row[2]+"\t"+row[3]);
		
		
		
	}
  
}
