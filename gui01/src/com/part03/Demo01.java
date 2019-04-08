package com.part03;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo01 extends JFrame {
	private MyButton but=new MyButton();
    public Demo01()
    {
    	super("Demo01");
    	this.setSize(300,200);
    	this.setLocation(200,200);
    	this.setLayout(new FlowLayout());
    	this.add(but);
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	but.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(Demo01.this, "^_^");
			}
		});
    }
	public static void main(String[] args) {
		 new Demo01();
	}

}
