package com.iss;

import org.apache.commons.dbutils.QueryRunner;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo23 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner(ds);
		Object[]params=new Object[]{2,"liming",24,"M",3000};
		//insert update delete ddl
		int re=run.update("insert into emp(dep_id ,name,age,sex,balance) values(?,?,?,?,?)",params);
	    
		System.out.println(re);
	}

}
