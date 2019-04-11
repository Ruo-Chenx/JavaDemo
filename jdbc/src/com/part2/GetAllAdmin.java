package com.part2;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class GetAllAdmin extends JFrame 
{
	
	//רΪ����ṩ���ݵ�ģ�� ����   Model
	private DefaultTableModel tbm=new DefaultTableModel();
	//���                          View
	private JTable jt=new JTable(tbm);
	private Object title[]=new Object[] {"���","�ʺ�","����","����"};
	private JScrollPane jsp=new JScrollPane(jt);
	
    public GetAllAdmin() 
    {
    	super("��ѯ��������");
    	this.setSize(600, 400);
    	this.setLocation(100, 50);
        tbm.setColumnIdentifiers(title);
    	initData();
    	
    	this.add(jsp);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    //�������ݿ�
    public void initData()
    {
        Connection con=null;
		
	    try {
			   Class.forName("com.mysql.jdbc.Driver");

                con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");


				PreparedStatement ps=con.prepareStatement("select * from admin");
				ResultSet rs=ps.executeQuery();
		        while(rs.next())
		        {
		        	Object[] row=new Object[4];
		        	row[0]=rs.getInt(1);
		        	row[1]=rs.getString("uname");
		        	row[2]=rs.getString("upwd");
		        	row[3]=rs.getString("name");
		        	tbm.addRow(row);
		        }
	    
	    } catch (HeadlessException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}finally
	    {
			try {
				if(null!=con&&!con.isClosed())
				{
					con.close();
				}
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	    }
	   
    }
    
    
    
	public static void main(String[] args) {
		new GetAllAdmin();

	}

}
