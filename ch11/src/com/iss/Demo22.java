package com.iss;

import java.sql.Connection;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo22 {

	public static void main(String[] args) throws Exception 
	{
		//javax.sql.DataSource�ӿڵ�ʵ����
		ComboPooledDataSource cpds = new ComboPooledDataSource();
		//ϵͳ����classpath��c3p0.properties�ļ��������е����ó�ʼ����cpds��
		
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
