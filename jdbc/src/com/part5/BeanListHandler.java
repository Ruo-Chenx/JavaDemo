package com.part5;

import java.lang.reflect.Field;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BeanListHandler<T> implements ResultSetHandler<T> {
    Class clazz;
    public  BeanListHandler(Class clazz)
    {
    	this.clazz=clazz;
    }
    
	@Override
	public T handler(ResultSet rs) {
		List list=new ArrayList();
	
		try {
			while(null!=rs && rs.next())
			{
			    Object row=clazz.newInstance();
			    Field[] all=clazz.getDeclaredFields();
			    if(null!=all && all.length>0)
			    {
			    	for(Field f:all)
			    	{
			    		String fname=f.getName();
			    		f.setAccessible(true);
			    		f.set(row, rs.getObject(fname));
			    	}
			    }
			    
			    list.add(row);
				
			}
		} catch (InstantiationException e) {
			
			e.printStackTrace();
		} 
		catch (IllegalAccessException e) {
			e.printStackTrace();
		} 
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		return (T) list;
	}

}
