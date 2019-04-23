package com.iss;

import java.sql.Connection;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo24 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		
		Object[]params=new Object[]{2,"lily",24,"F",3000};
		//insert update delete ddl
		int re=run.update(con,"insert into emp(dep_id ,name,age,sex,balance) values(?,?,?,?,?)",params);
	    
		System.out.println(re);
	}

}
