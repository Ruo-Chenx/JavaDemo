package com.iss;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo02 {

	public static void main(String[] args){
	
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbb?user=root&password=mysql");
			System.out.println(con);
			
			
		} catch (ClassNotFoundException e) {
			 System.out.println("�Ҳ���������");
		} catch (SQLException e) {
			 System.out.println("�������ݿ�ʧ��");
			 e.printStackTrace();
		}

	}

}
