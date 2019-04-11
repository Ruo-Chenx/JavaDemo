package com.part4;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import com.alibaba.druid.pool.DruidDataSource;

public class Demo02 {
	
	  private static DruidDataSource ds=null;
	
	   static{
		  //初始化连接池
		   try {
				ResourceBundle res=ResourceBundle.getBundle("jdbc");
				
				ds=new DruidDataSource();
				ds.setUrl(res.getString("url"));
				ds.setDriverClassName(res.getString("driverClassName"));
				ds.setUsername(res.getString("username"));
				ds.setPassword(res.getString("password"));
				ds.setFilters(res.getString("filters"));
				ds.setMaxActive(Integer.parseInt(res.getString("maxActive")));
				ds.setInitialSize(Integer.parseInt(res.getString("initialSize")));
				ds.setMaxWait(Long.parseLong(res.getString("maxWait")));
				ds.setMinIdle(Integer.parseInt(res.getString("minIdle")));
				//ds.setMaxIdle(Integer.parseInt(res.getString("maxIdle")));

				//ds.setTimeBetweenEvictionRunsMillis(Long.parseLong(res.getString("timeBetweenEvictionRunsMillis")));
				//ds.setMinEvictableIdleTimeMillis(Long.parseLong(res.getString("minEvictableIdleTimeMillis")));
				//ds.setValidationQuery(res.getString("validationQuery"));
				
				
			} catch (Exception e) {
				e.printStackTrace();
			} 
	   }
	
	
	public static void main(String[] args) throws Exception
	{
         Connection con=ds.getConnection();
		
		System.out.println(con);
		
		
		DatabaseMetaData  dm=con.getMetaData();
		
		ResultSet rs=dm.getTables("xupt", null, null, null);
		while(rs.next())
		{
			System.out.println(rs.getString("TABLE_NAME"));
		}
		
		con.close();//把它回放到池中

	}

}
