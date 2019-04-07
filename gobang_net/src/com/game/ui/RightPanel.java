package com.game.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import com.net.client.ClientUtils;
import com.net.util.Message;

public class RightPanel extends JPanel 
{
    private ImageIcon icon01=null;
    private ImageIcon icon02=null;
    private JLabel img01=new JLabel();
    private JLabel img02=new JLabel(); 
    private JLabel   vs=new JLabel("VS");
    private JLabel   own=new JLabel("");
    private JLabel   other=new JLabel("");
    
    private JLabel msg=new JLabel("");
    private JTextArea jta=new JTextArea();
   // private JEditorPane  jta=new JEditorPane();
    private JScrollPane jsp=new JScrollPane(jta);
    private JTextField sendmsg=new JTextField();
    private JButton send=new JButton("发送");
    private JLabel sendlabel=new JLabel("说");
    private JLabel bakimg=new JLabel();
    
    public RightPanel()
    {
    	//super("sss");
    	this.setSize(300,Config.HEIGHT);
    	this.setLocation(Config.WIDTH,0);
    	
    	//icon01=new ImageIcon(this.getClass().getResource("/com/res/mm01.jpg"));
    	//icon02=new ImageIcon(this.getClass().getResource("/com/res/mm02.jpg"));
    	//img01.setIcon(icon01);
    	//img02.setIcon(icon02);
    	
    	
    	this.setLayout(null);
    	bakimg.setBounds(0, 0, 300, Config.HEIGHT);
    	
    	img01.setBounds(10, 10, 100, 100);
    	img02.setBounds(170,10,100,100);
    	vs.setFont(new Font("微软雅黑", Font.BOLD, 20));
    	vs.setForeground(Color.red);
    	vs.setBounds(120,40, 60, 30);
    	
    	own.setForeground(Color.black);
    	own.setBounds(20, 110, 120, 30);
    	
    	other.setForeground(Color.white);
    	other.setBounds(180,110, 120, 30);
    	
    	msg.setFont(new Font("微软雅黑", Font.BOLD, 20));
    	msg.setForeground(Color.red);
    	msg.setBounds(50, 140, 260, 30);
    	
    	jsp.setBounds(0, 190, 280, 360);
    	jta.setEditable(false);
    	sendmsg.setBounds(0, 550, 230, 30);
    	send.setBounds(230, 550, 60, 30);
    	
    	
    	this.add(img01);
    	this.add(img02);
    	this.add(vs);
    	this.add(own);
    	this.add(other);
    	
    	this.add(msg);
    	this.add(jsp);
    	
    	this.add(sendmsg);
    	this.add(send);
    	
    	//this.setBackground(Color.PINK);
    	//this.setVisible(true);
    	//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	send.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {

                  String str=own.getText()+":"+sendmsg.getText();
                  ClientUtils.sendMsg(Message.CHAT, str.getBytes());
				
			}
		});
    }
    
  /**
   * 设置自己的头相和名字
   * @param name
   */
    public void setOwnName(String name)
    {
    	int index=Integer.parseInt(name.substring(0, 1));
    	String uname=name.substring(1);
    	own.setText(uname);
    	img01.setIcon(new ImageIcon(this.getClass().getResource("/com/res/mm0"+(index+1)+".jpg")));
    	
    	this.updateUI();
    }
    /**
     * 设置别人的头相和名字
     * @param name
     */
      public void setOtherName(String name)
      {
      	int index=Integer.parseInt(name.substring(0, 1));
      	String uname=name.substring(1);
      	other.setText(uname);
      	img02.setIcon(new ImageIcon(this.getClass().getResource("/com/res/mm0"+(index+1)+".jpg")));
      	
      	this.updateUI();
      }
    /**
     * 设置自己是白还是黑
     * @param type
     */
    public void setOwnTypes(int type)
    {
    	if(type==Config.BLACK)
    	{
    		own.setForeground(Color.BLACK);
    		other.setForeground(Color.WHITE);
    	}
    	if(type==Config.WHITE)
    	{
    		other.setForeground(Color.BLACK);
    		own.setForeground(Color.WHITE);
    	}
    	this.updateUI();
    }
    /**
     * 设置信息
     * @param info
     */
public void setMessage(String info)
{
	msg.setText(info);
	this.updateUI();
}
/**
 * 收到对方说的话
 * @param info
 */
public void appendInfo(String info)
{
	
jta.append("\n\r"+info);
this.updateUI();
}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		//super.paintComponent(g);
		try {
			BufferedImage img=ImageIO.read(this.getClass().getResource("/com/res/bak2.jpg"));
			g.drawImage(img,0, 0, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}




	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(300, Config.HEIGHT);
	}




	public static void main(String[] args) {
		new RightPanel();
	}
    
}
