package com.part5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * 提供以数据库操作的工具类
 * @author Administrator
 *
 */
public class MyDbutils 
{
	 private static DruidDataSource ds=null;
	 private static ThreadLocal<Connection> tls=new ThreadLocal<Connection>();	
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
	   /**
	    * 得到一个连接
	    * @return
	    */
	   public static Connection getConnection()throws SQLException
	   {
		   Connection con=tls.get();
		   if(null==con || (con.isClosed()))
		   {
			   con=ds.getConnection();
		       tls.set(con);
	       }
		   return con;
	   }
	   //开始事务
	   public static void starTransaction()throws SQLException
	   {
		   Connection con=getConnection();
		   con.setAutoCommit(false);
	   }
	   public static void commit()throws SQLException
	   {
		   Connection con=getConnection();
		   con.commit();
	   }
	   public static void rollback()throws SQLException
	   {
		   Connection con=getConnection();
		   con.rollback();
	   }
	   
	   /**
	    * 对数据库进行增删改操作
	    * insert into aaa(a,b,c) values(?,?,?)
	    * @param sql
	    * @param params  参数
	    */
	   public static void update(String sql,Object...params)throws SQLException
	   {
		   Connection con=getConnection();
		   PreparedStatement ps=con.prepareStatement(sql);
		   setparam(ps, params);
		   ps.executeUpdate();
		  
		   
	   }
	   
	   /**
	    * 查询
	    */
	
	   public static ResultSet query(String sql,Object...params)throws SQLException
	   {
		   Connection con=getConnection();
		   PreparedStatement ps=con.prepareStatement(sql);
		   setparam(ps, params);
		   return  ps.executeQuery();
	   }
	   /**
	    * 查询
	    * @param sql
	    * @param rsh
	    * @param params
	    * @return
	    * @throws SQLException
	    */
	   public static<T> T query(String sql,ResultSetHandler<T> rsh,Object...params)throws SQLException
	   {
		   Connection con=getConnection();
		   PreparedStatement ps=con.prepareStatement(sql);
		   setparam(ps, params);
		   
		   T t=rsh.handler(ps.executeQuery());
		   return t;
	   }
	   
	   public static void setparam(PreparedStatement ps,Object...params)throws SQLException
	   {
		   if(null!=params && params.length>0)
		   {
			   for(int i=0;i<params.length;i++)
			   {
				   ps.setObject(i+1, params[i]);
			   }
		   }
	   }
}
