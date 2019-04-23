package com.iss;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo22 {

	public static void main(String[] args) throws Exception 
	{
		//javax.sql.DataSource接口的实现类
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		//系统会在classpath找c3p0.properties文件，把其中的配置初始化到cpds中
		
		/*cpds.setDriverClass("com.mysql.jdbc.Driver"); //loads the jdbc driver            
		cpds.setJdbcUrl("jdbc:mysql://localhost:3306/bbb");
		cpds.setUser("root");                                  
		cpds.setPassword("mysql");                                  
			
		// the settings below are optional -- c3p0 can work with defaults
		cpds.setMinPoolSize(3);                                     
		cpds.setInitialPoolSize(4);
		cpds.setMaxPoolSize(10);
		*/
		Connection con=cpds.getConnection();
		System.out.println(con);
		con.close();

	}

}
