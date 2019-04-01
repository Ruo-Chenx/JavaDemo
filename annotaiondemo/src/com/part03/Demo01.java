package com.part03;

import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Demo01 extends JFrame {

	@ButtonListener("com.part03.OkListener")
	private JButton ok=new JButton("OK");
	
	@ButtonListener("com.part03.CancelListener")
	private JButton cancel=new JButton("Cancel");
	
	
	public Demo01()
	{
		super("Demo01");
		this.setSize(400, 300);
		this.setLocation(200, 200);
		this.setLayout(new FlowLayout());
		this.add(ok);
		this.add(cancel);		
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 proccessbutton();
	}
	//解析Annotation
	public void proccessbutton()
	{
		try {
			Class clazz=this.getClass();
			//所有成员
			Field allf[]=clazz.getDeclaredFields();
			for(Field f:allf)
			{
				//只打按钮
				if(f.getType()==JButton.class)
				{
					Annotation an=f.getAnnotation(ButtonListener.class);
					if(an instanceof ButtonListener)
					{
						ButtonListener bl=(ButtonListener)an;
						String value=bl.value();
						//取当前成员
						f.setAccessible(true);
						JButton curr=(JButton)f.get(this);
						curr.addActionListener((ActionListener)Class.forName(value).newInstance());
					}
				}
			}
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Demo01();
	}

}
