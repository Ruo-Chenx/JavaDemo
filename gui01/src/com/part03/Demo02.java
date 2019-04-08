package com.part03;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class Demo02 extends JFrame {
	private MyButton but=new MyButton();
    public Demo02()
    {
    	super("Demo01");
    	this.setSize(600,400);
    	this.setLocation(200,200);
    	//设置该框架是否可以由用户调整大小。
    	this.setResizable(false);
    	
    	this.setLayout(new FlowLayout());
    	this.add(but);
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    }
    
    
/*	public void paint1(Graphics g) {
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 300,200);
	}
*/
	
	

	@Override
	public void paint(Graphics g) {
		super.paint(g);
	
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 300,400);
		
		g.setColor(new Color(255,255,255));
		g.drawRect(50, 50, 100, 60);
		
		g.setColor(Color.black);
		g.drawLine(0, 0, 600, 400);
		
		g.setColor(new Color(0xFF,0xFF,0xFF));
		g.setFont(new Font("微软雅黑",Font.BOLD,24));
		g.drawString("大家好", 100, 150);
		
		try {
			Image img=ImageIO.read(Demo02.class.getResource("/com/res/home.png"));
			g.drawImage(img, 500, 300, null);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


	
	
	


	public static void main(String[] args) {
		 new Demo02();
	}

}
