package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Demo03 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Properties p=new Properties();
			p.setProperty("user", "root");
			p.setProperty("password","mysql");
			
			
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb",p);
			System.out.println(con);
			
			
		} catch (ClassNotFoundException e) {
			 System.out.println("�Ҳ���������");
		} catch (SQLException e) {
			 System.out.println("�������ݿ�ʧ��");
			 e.printStackTrace();
		}

	}

}
