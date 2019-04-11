package com.part5;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ArrayHandler implements ResultSetHandler<List<Object[]>> {

	@Override
	public List<Object[]> handler(ResultSet rs) {
		
		List<Object[]> list=new ArrayList<Object[]>();
		try {
			if(null!=rs)
			{
				ResultSetMetaData rm=rs.getMetaData();
				int ccount=rm.getColumnCount();
				
				while(rs.next())
				{
					Object[] row=new Object[ccount];
					for(int i=0;i<ccount;i++)
					{
						row[i]=rs.getObject(i+1);
					}
					list.add(row);
				}
				
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return list;
	}

}
