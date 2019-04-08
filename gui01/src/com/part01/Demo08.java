package com.part01;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo08 extends JFrame {
	private JButton but1=new JButton("确定");
	private JButton but2=new JButton("取消");
   public Demo08()
   {
	   super("Demo03");
	   this.setSize(600,400);
	   this.setLocation(200, 200);
	   this.setResizable(false);
	  
	   this.setLayout(null);//绝对定位
	   but1.setSize(120,80);
	   but1.setLocation(100, 100);
	   
	   but2.setBounds(150, 150, 120, 34);
	   
	   this.add(but1);
	   this.add(but2);
       this.setVisible(true);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
   }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new Demo08();
	}

}
