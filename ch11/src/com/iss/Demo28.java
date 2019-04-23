package com.iss;

import java.sql.Connection;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayHandler;
import org.apache.commons.dbutils.handlers.BeanHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo28 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		//ResultSet的第一行数据，以对象数组返回
		Object[] all=run.query(con, "select * from emp where id>?",new ArrayHandler(),3);
		
			System.out.println(all[0]+"\t"+all[2]+"\t"+all[3]);
		
		
		
	}
  
}
