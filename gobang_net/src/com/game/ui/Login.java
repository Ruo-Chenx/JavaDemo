package com.game.ui;

import java.awt.Component;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;

import com.net.client.Client;
import com.net.client.ClientUtils;
import com.net.util.Message;

public class Login extends JFrame 
{
	Client client=new Client(8888,"127.0.0.1");
	private JComboBox<String> jcom=null;//new JComboBox<String>();
	private JTextField  name=new JTextField();
	private JButton  ok=new JButton("登录");
	private DefaultComboBoxModel<String> cm=null;
	private JLabel   lname=new JLabel("请输入姓名 ：");
	
    public Login()
    {
    	super("五子棋登录");
    	client.start();//连接服务器
    	new Thread(new Runnable() {
			
			@Override
			public void run() {
				 while(true)
				 {
					 if(null!=ClientUtils.getChannel()&&ClientUtils.getChannel().isOpen())
					 {
						 Login.this.setTitle("五子棋登录，已连上服务器...");
						 break;
					 }else
					 {
						 Login.this.setTitle("五子棋登录，断开了服务器...");
					 }
					 try {	Thread.sleep(1000);	} catch (InterruptedException e) {e.printStackTrace();}
				 }
			}
		}).start();
    	
    	this.setSize(500, 200);
    	this.setLocation(300,200);
    	this.setLayout(null);
    	cm=new DefaultComboBoxModel<String>();
    	cm.addElement("mm01.jpg");
    	cm.addElement("mm02.jpg");
    	cm.addElement("mm03.jpg");
    	cm.addElement("mm04.jpg");
    	jcom=new JComboBox<String>(cm);
    	//重绘下拉框
    	jcom.setRenderer(new ListCellRenderer<String>() {

			@Override
			public Component getListCellRendererComponent(JList<? extends String> list, String value, int index,
					boolean isSelected, boolean cellHasFocus) {
				JLabel imglabel=new JLabel();
				imglabel.setIcon(new ImageIcon(this.getClass().getResource("/com/res/"+value)));
				
				return imglabel;
			}
		});
    	
    	lname.setFont(new Font("微软雅黑",Font.BOLD,20));
    	lname.setBounds(125, 30, 130, 30);
    	jcom.setBounds(20, 35, 100, 100);
    	name.setBounds(125, 78, 200, 50);
    	ok.setBounds(340, 26, 100, 100);
    	
    	this.add(jcom);
    	this.add(lname);
    	this.add(name);
    	this.add(ok);
    	
    	this.setResizable(false);
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	ok.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int imgindex=jcom.getSelectedIndex();
				String uname=name.getText();
				
				String allmsg=String.valueOf(imgindex)+uname;
				ClientUtils.sendMsg(Message.REQ, allmsg.getBytes());//发给服务器
				new Thread(new Runnable() {
					
					@Override
					public void run() {
						while(true)
						{
							Message msg=ClientUtils.pop();
							if(msg.getType()==Message.BLACK||msg.getType()==Message.WHITE)
							{
								Login.this.dispose();
								
								new MainFrame(allmsg,Message.BLACK==msg.getType()?Config.BLACK:Config.WHITE);
								//System.out.println("登录成功");
								break;
							}
						}
						
					}
				}).start();
			}
		});
    }
	public static void main(String[] args) {
		 new Login();
	}

}
