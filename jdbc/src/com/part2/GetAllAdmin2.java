package com.part2;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class GetAllAdmin2 extends JFrame 
{
	
	//专为表格提供数据的模型 对象   Model
	private DefaultTableModel tbm;//new DefaultTableModel();
	//表格                          View
	private JTable jt=new JTable();
	
	private Object title[]=new Object[] {"序号","帐号","密码","姓名"};
	private JScrollPane jsp=new JScrollPane(jt);
	
	
	 private JTextField uname=new JTextField("用户名",10);
	    private JTextField name=new JTextField("姓名",10);
	    private JPasswordField  upwd=new JPasswordField(6);
	    private JButton ok=new JButton("增加");
	    private JPanel top=new JPanel();
	
    public GetAllAdmin2() 
    {
    	super("查询所有内容");
    	this.setSize(600, 400);
    	this.setLocation(100, 50);
       
    	initData();
    	
    	top.add(uname);
    	top.add(upwd);
    	top.add(name);
    	top.add(ok);
    	this.add(top,BorderLayout.NORTH);
    	
    	this.add(jsp,BorderLayout.CENTER);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   addactoin();
			   initData();
			   jt.updateUI();
				
			}
		});
    }
    
    //操作数据库
    public void initData()
    {
    	tbm=new DefaultTableModel();
    	
    	tbm.setColumnIdentifiers(title);
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
		        
		        jt.setModel(tbm);
	    
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
    //增加
    
    public void addactoin()
	{
		Connection con=null;
		
	    try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xupt","root","mysql");
			
			Statement stat=con.createStatement();
			
			String unamev=uname.getText();
			String upwdv=new String(upwd.getPassword());
			String namev=name.getText();
			
			//变量中的内容可能会影响sql语句的结构
			String sql="insert into admin(uname,name,upwd) values('"+unamev+"','"+namev+"','"+upwdv+"')";
			
			System.out.println(sql);
			int re=stat.executeUpdate(sql);




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
		new GetAllAdmin2();

	}

}
