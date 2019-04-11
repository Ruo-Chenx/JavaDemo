package com.part5;

import java.sql.ResultSet;
import java.util.List;

import org.junit.Test;

public class Main {

	@Test
	public void testupdata()throws Exception
	{
	    MyDbutils.update("insert into admin(uname,upwd,name) values(?,?,?)", "jack","jack123","หัมห");
		
		System.out.println("Ok");
	}
	@Test
	public void testupdata2()throws Exception
	{
		MyDbutils.starTransaction();
		
		try {
			MyDbutils.update("update person set age=age-1 where id=?", 2);
			MyDbutils.update("update person set age=age+1 where id=?", 1);
			MyDbutils.commit();
		} catch (Exception e) {
			MyDbutils.rollback();
			e.printStackTrace();
		}
		System.out.println("ok");
	}
	
	@Test
	public void query1()throws Exception
	{
	   ResultSet rs=MyDbutils.query("select * from admin where id>?", 5);
	   while(rs.next())
	   {
		   System.out.println(rs.getInt(1)+"\t"+rs.getString("name"));
	   }
		System.out.println("Ok");
	}
	
	@Test
	public void query2()throws Exception
	{
	  List<Admin> list=MyDbutils.query("select * from admin where id>?",new AdminHandler(), 5);
	 
	  for(Admin ad:list)
	   {
		   System.out.println(ad.getId()+"\t"+ad.getName()+"\t"+ad.getUname());
	   }
		System.out.println("Ok");
	}
	
	@Test
	public void query3()throws Exception
	{
	  List<Person> list=MyDbutils.query("select * from person",new BeanListHandler<List<Person>>(Person.class), null);
	 
	  for(Person p:list)
	   {
		   System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getAge());
	   }
		System.out.println("Ok");
	}
	@Test
	public void query4()throws Exception
	{
	  List<Object[]> list=MyDbutils.query("select * from emp",new ArrayHandler(), null);
	 
	  for(Object[] p:list)
	   {
		  for(int i=0;i<p.length;i++)
		  {
			  System.out.print(p[i]+"\t");
		  }
		  System.out.println();
		  
	   }
		System.out.println("Ok");
	}
	
}
