package com.part4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;

import com.alibaba.druid.pool.DruidDataSource;

public class Demo01 {

	public static void main(String[] args) throws Exception
	{
		//javax.sql.DataSource的实现类
		DruidDataSource ds=new DruidDataSource();
		ds.setDriverClassName("com.mysql.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/xupt");
		ds.setUsername("root");
		ds.setPassword("mysql");
		
		ds.setInitialSize(3);
		ds.setMaxActive(30);
		
		
		Connection con=ds.getConnection();
		
		System.out.println(con);
		
		
		DatabaseMetaData  dm=con.getMetaData();
		
		ResultSet rs=dm.getTables("xupt", null, null, null);
		while(rs.next())
		{
			System.out.println(rs.getString("TABLE_NAME"));
		}
		
		con.close();//把它回放到池中
		Thread.sleep(20000);

	}

}
