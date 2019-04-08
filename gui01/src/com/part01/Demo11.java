package com.part01;

import java.awt.TextArea;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Demo11 extends JFrame {
	private JPanel pan=new JPanel();
	private Icon icon=null;
	private JButton but=null;
	private JTextField  fi=new JTextField("your name", 20);
	private JPasswordField jpwd=new JPasswordField(10);
	private JLabel la=new JLabel("用户名:");
	
	String names[]=new String[] {"张三","李四"};
	private JComboBox<String> jcom=new JComboBox<String>(names);
	private JRadioButton jra=new JRadioButton("男", true);
	private JCheckBox  jcb=new JCheckBox("aa",false);
	
	//swing
	private JTextArea jta=new JTextArea(5, 30);	
	private JScrollPane jsp=new JScrollPane(jta);
	//awt
	private TextArea ta=new TextArea(5, 30);
	
	private JMenuBar jmb=new JMenuBar();
	private JMenu file=new JMenu("文件");
	private JMenu edit=new JMenu("编辑");
	private JMenuItem i1=new JMenuItem("打开");
	private JMenuItem i2=new JMenuItem("关闭");
	private JMenuItem i3=new JMenuItem("复制");
	private JMenuItem i4=new JMenuItem("取消");
	
    public Demo11()
    {
    	super("Demo11");
    	this.setSize(600, 400);
    	this.setLocation(200, 200);
    	icon=new ImageIcon(Demo11.class.getResource("/com/res/home.png"));
    	but=new JButton(icon);
    	
    	pan.add(but);
    	pan.add(fi);
    	pan.add(jpwd);
    	pan.add(la);
    	pan.add(jcom);
    	pan.add(jra);
    	pan.add(jcb);
    	pan.add(jsp);
    	pan.add(ta);
    	
    	file.add(i1);
    	file.addSeparator();
    	file.add(i2);
    	edit.add(i3);
    	edit.add(i4);
    	jmb.add(file);
    	jmb.add(edit);
    	
    	this.setJMenuBar(jmb);
    	
    	
    	this.add(pan);
    	
    	this.setVisible(true);
    	this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    
    
	public static void main(String[] args) {

		new Demo11();
	}

}
