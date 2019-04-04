package com.db.core;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ResourceBundle;
import java.util.TreeMap;

import com.db.annotation.Colunm;
import com.db.annotation.Exclude;
import com.db.annotation.Table;
import com.db.test.Student;

public class Db 
{
	private static ResourceBundle res=ResourceBundle.getBundle("jdbc");
	static
	{
		try {
			Class.forName(res.getString("driver"));
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection()
	{
		Connection con=null;
		try {
			con=DriverManager.getConnection(res.getString("url"), res.getString("user"), res.getString("pwd"));
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return con;
	}
	
	
   /**
    * 增加一个对象，自动将此对象的数据写入数据库
    * @param t
    * @return
    * @throws SQLException
    */
	public static<T> long add(T t)throws SQLException
	{
		long re=0;

			String tableName=getTableName(t);
			
			
		    TreeMap<String,Object> fieldmap=parseFiledandValue2map(t);
			StringBuilder flist=new StringBuilder();
			StringBuilder qlist=new StringBuilder();
			List<Object> values=new ArrayList<Object>();
			
			Iterator<String> it=fieldmap.keySet().iterator();
			while(it.hasNext())
			{
				String key=it.next();
				Object value=fieldmap.get(key);
				flist.append(key+",");
				qlist.append("?,");
				values.add(value);
			}

			String sql="insert into "+tableName+"("+flist.deleteCharAt(flist.length()-1)+") values("+qlist.deleteCharAt(qlist.length()-1)+") ";
			
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement(sql);
			if(values.size()>0)
			{
				for(int i=0;i<values.size();i++)
				{
					ps.setObject(i+1, values.get(i));
				}
			}
			re=ps.executeUpdate();
			
			
			System.out.println(sql);
	
		return re;
	}
	/**
	 * 自动列新   update tname set a=?,b=?,c=? where id=?
	 * @param t
	 * @throws SQLException
	 */
	public static<T> void update(T t)throws SQLException
	{
		
	}
	
	/**
	 * delete from tname where id=?
	 * @param t
	 * @throws SQLException
	 */
	public static <T> void delete(T t)throws SQLException
	{
		
	}
	/**
	 * 查询这个表的所有数据   
	 * @return
	 * @throws SQLException
	 */
	public static<T> List<T>  getAll()throws SQLException
	{
		return null;
	}
	
	
	/**
	 * 将T中的所有成员列表和值解析到Map
	 * @param t
	 * @return
	 */
	public static<T> TreeMap<String,Object>  parseFiledandValue2map(T t)
	{
		TreeMap<String,Object> fieldmap=new TreeMap<String,Object>();
		try {
			Class clazz=t.getClass();
			
			Field []allf=clazz.getDeclaredFields();
			if(null!=allf&&allf.length>0)
			{
				for(Field f:allf)
				{
					Annotation exl=f.getAnnotation(Exclude.class);
					if(null!=exl)continue;
					
					
					Annotation cano=f.getAnnotation(Colunm.class);
					String fname=null;
					if(null!=cano && (cano instanceof Colunm))
					{
						Colunm col=(Colunm)cano;
						fname=col.value();
					}else
					{
						 fname=f.getName();
					}
					
					if("id".equals(fname))continue;
					f.setAccessible(true);
					fieldmap.put(fname, f.get(t));
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return fieldmap;
	}
	
	/**
	 * 从 T好解析表名 
	 * @param t
	 * @return
	 */
	public static<T> String getTableName(T t)
	{
		String tablename=null;
		Class clazz=t.getClass();
		Annotation ano=clazz.getAnnotation(Table.class);
		if(null!=ano)
		{
			//有Table  
			if(ano instanceof Table)
			{
				Table an=(Table)ano;
				tablename=an.value();
			}
			
		}else
		{
			//没有annotation   Table
			String allname=clazz.getName();//com.db.coure.Sudent
			int lastdot=allname.lastIndexOf(".");
			tablename=allname.substring(lastdot+1,lastdot+2).toLowerCase()+allname.substring(lastdot+2);
		}
		
		return tablename;
	}
	
	
}
