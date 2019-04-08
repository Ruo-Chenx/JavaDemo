package com.part02;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Demo02 extends JFrame {
	private JLabel show=new JLabel();
	private JButton but1=new JButton("OK");
	private JTextField jtx=new JTextField(20);
	private JComboBox<String> jcom=new JComboBox<String>(new String[] {"lisi","wangwu"});
    public Demo02()
    {
    	super("Demo01");
    	this.setSize(400,300);
    	this.setLocation(200, 200);
    	this.setLayout(new FlowLayout());
    	this.add(show);
    	this.add(but1);
    	this.add(jcom);
    	this.add(jtx);
    	
    	this.setVisible(true);
        this.addWindowListener(new windowClose()); 

        initlistener();

    }
    
    public void initlistener()
    {
        but1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				 show.setText("单击了按钮!");
				
			}
		});
        jcom.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//  show.setText(e.getItem().toString());
				
				JComboBox<String> src=(JComboBox<String>)e.getSource();
				show.setText((String)src.getSelectedItem());
			}
		});
        
        this.addMouseListener(new MouseAdapter() {

			@Override
			public void mouseClicked(MouseEvent e) {
				Demo02.this.setTitle("单击了--"+e.getButton());
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				Demo02.this.setTitle("进入--"+e.getX()+"--"+e.getY());
			}

			@Override
			public void mouseExited(MouseEvent e) {
				Demo02.this.setTitle("离开--"+e.getX()+"--"+e.getY());
			}
        	
		});
        //添加指定的密钥侦听器以从该组件接收密钥事件。
        jtx.addKeyListener(new KeyAdapter() {

			@Override
			public void keyTyped(KeyEvent e) {
				 show.setText(e.getKeyChar()+"");
			}
        	
		});
        
    }
	public static void main(String[] args)
	{
		  new Demo02();

	}
	/**
	 * 处理窗口上的事件
	 * @author Administrator
	 *
	 */
	class windowClose extends  WindowAdapter implements WindowListener
	{

	

		@Override
		public void windowClosing(WindowEvent e) {
			  System.out.println("-----------------"+e.getSource());
			  System.exit(0);
			
		}

	}
}

