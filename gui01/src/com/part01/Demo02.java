package com.part01;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Demo02 extends JFrame {
	
	private JButton but=new JButton("OK");
	
    public Demo02()
    {
    	super("Demo02");
    	this.setSize(400, 300);
    	this.setLocation(200, 200);
    	this.setResizable(false);
    	this.setLayout(new FlowLayout());
    	this.add(but);
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    	
    	but.addActionListener(new ActionListener() {	
			@Override
			public void actionPerformed(ActionEvent e) {
				
				JOptionPane.showMessageDialog(Demo02.this, "´ó¼ÒºÃ");
			}
		});
    }
	public static void main(String[] args) {
		   new Demo02();
	}

}
