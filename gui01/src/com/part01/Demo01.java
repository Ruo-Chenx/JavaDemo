package com.part01;

import javax.swing.JFrame;

public class Demo01 extends JFrame  {
	
	public Demo01()
	{
		super("Demo01");
		this.setSize(600, 400);
		this.setLocation(200, 200);
		
		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new Demo01();
	}

}
