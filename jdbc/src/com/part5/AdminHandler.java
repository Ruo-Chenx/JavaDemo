package com.part5;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AdminHandler implements ResultSetHandler<List<Admin>> {

	@Override
	public List<Admin> handler(ResultSet rs) {
		List<Admin> list=new ArrayList<Admin>();
		try {
			while(rs.next())
			{
				Admin admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setUname(rs.getString("uname"));
				admin.setUpwd(rs.getString("upwd"));
				admin.setName(rs.getString("name"));
				
				list.add(admin);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

}
