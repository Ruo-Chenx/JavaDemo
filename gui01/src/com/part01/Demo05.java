package com.part01;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo05 extends JFrame {
	
	private JButton but1=new JButton("b1");
	private JButton but2=new JButton("b2");
	private JButton but3=new JButton("b3");
	private JButton but4=new JButton("b4");
	private JButton but5=new JButton("b5");
	
    public Demo05()
    {
    	super("Demo02");
    	this.setSize(400, 300);
    	this.setLocation(200, 200);
    	
    	//东南西北中
    	//this.setLayout(new BorderLayout(10,20));
    	this.setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
    	this.add(but1,BorderLayout.NORTH);
    	this.add(but2,BorderLayout.SOUTH);
    	this.add(but3,BorderLayout.WEST);
    	this.add(but4,BorderLayout.EAST);
    	this.add(but5,"Center");
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	
    }
	public static void main(String[] args) {
		   new Demo05();
	}

}
