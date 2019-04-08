package com.part01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo10 extends JFrame {
	
	private JButton but1=new JButton("b1");
	private JButton but2=new JButton("b2");
	private JButton but3=new JButton("b3");
	private JButton but4=new JButton("b4");
	private JButton but5=new JButton("b5");
	
	private Box box1=Box.createHorizontalBox();
	private Box box2=Box.createVerticalBox();
	private Box box3=Box.createVerticalBox();
	
	
    public Demo10()
    {
    	super("Demo02");
    	this.setSize(400, 300);
    	this.setLocation(200, 200);
    	
    	//东南西北中
    	
    	box1.add(but1,BorderLayout.NORTH);
    	box1.add(Box.createGlue());
    	box1.add(but2,BorderLayout.SOUTH);
    	
    	box2.add(but3,BorderLayout.WEST);
    	box2.add(Box.createVerticalStrut(30));
    	box2.add(but4,BorderLayout.EAST);
    	
    	box3.add(but5,"Center");
    	
    	box3.add(box1);
    	box3.add(box2);
    	
    	this.add(box3);
    	
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
    }
	public static void main(String[] args) {
		   new Demo10();
	}

}
