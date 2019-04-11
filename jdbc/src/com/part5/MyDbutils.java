package com.part5;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;

import com.alibaba.druid.pool.DruidDataSource;

/**
 * �ṩ�����ݿ�����Ĺ�����
 * @author Administrator
 *
 */
public class MyDbutils 
{
	 private static DruidDataSource ds=null;
	 private static ThreadLocal<Connection> tls=new ThreadLocal<Connection>();	
	   static{
		  //��ʼ�����ӳ�
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
	    * �õ�һ������
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
	   //��ʼ����
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
	    * �����ݿ������ɾ�Ĳ���
	    * insert into aaa(a,b,c) values(?,?,?)
	    * @param sql
	    * @param params  ����
	    */
	   public static void update(String sql,Object...params)throws SQLException
	   {
		   Connection con=getConnection();
		   PreparedStatement ps=con.prepareStatement(sql);
		   setparam(ps, params);
		   ps.executeUpdate();
		  
		   
	   }
	   
	   /**
	    * ��ѯ
	    */
	
	   public static ResultSet query(String sql,Object...params)throws SQLException
	   {
		   Connection con=getConnection();
		   PreparedStatement ps=con.prepareStatement(sql);
		   setparam(ps, params);
		   return  ps.executeQuery();
	   }
	   /**
	    * ��ѯ
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
