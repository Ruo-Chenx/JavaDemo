package com.part2;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class AddAdmin extends JFrame 
{
    private JTextField uname=new JTextField("�û���");
    private JTextField name=new JTextField("����");
    private JPasswordField  upwd=new JPasswordField();
    private JButton ok=new JButton("����");
    
    private Box box=Box.createVerticalBox();
	public AddAdmin()
	{
		super("����admin");
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setResizable(false);
		box.add(uname);
		box.add(name);
		box.add(upwd);
		box.add(ok);
		
		
		this.add(box);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ok.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e)
			{
				 addactoin();
			}
		});
	}
	
	
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
			
			//�����е����ݿ��ܻ�Ӱ��sql���Ľṹ
			String sql="insert into admin(uname,name,upwd) values('"+unamev+"','"+namev+"','"+upwdv+"')";
			
			System.out.println(sql);
			int re=stat.executeUpdate(sql);
			if(re==1)
						   JOptionPane.showMessageDialog(AddAdmin.this, "���ӳɹ�");
			else
						   JOptionPane.showMessageDialog(AddAdmin.this, "����ʧ��");
					
	    
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
		// TODO Auto-generated method stub
         new AddAdmin();
	}

}
