package com.iss;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.ResultSetHandler;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class Demo25 {
	
	public static ComboPooledDataSource ds=new ComboPooledDataSource();

	public static void main(String[] args) throws Exception
	{
		QueryRunner run=new QueryRunner();
		Connection con=ds.getConnection();
		
		List<Emp> list=run.query(con, "select * from emp", new ResultSetHandler<List<Emp>>(){

			@Override
			public List<Emp> handle(ResultSet rs) throws SQLException {
				List<Emp> li=new ArrayList<Emp>();
				while(rs.next())
				{
					Emp emp=new Emp();
					emp.setId(rs.getInt("id"));
					emp.setDep_id(rs.getInt("dep_id"));
					emp.setAge(rs.getInt("age"));
					emp.setName(rs.getString("name"));
					emp.setBalance(rs.getInt("balance"));
					emp.setSex(rs.getString("sex"));
					
					li.add(emp);
				}
				
				return li;
			}
			
		});
		
		for(Emp emp:list)
		{
			System.out.println(emp.getId()+"\t"+emp.getName()+"\t"+emp.getAge());
		}
		
		
	}
    static class Emp
    {
    	private int id;
    	private int dep_id;
    	private String name;
    	 private int age;
    	 private String  sex;
    	 private int  balance;
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public int getDep_id() {
			return dep_id;
		}
		public void setDep_id(int dep_id) {
			this.dep_id = dep_id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public int getBalance() {
			return balance;
		}
		public void setBalance(int balance) {
			this.balance = balance;
		}
    	 
    }
}
