package com.part02;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

public class Demo01 extends JFrame {
    public Demo01()
    {
    	super("Demo01");
    	this.setSize(400,300);
    	this.setLocation(200, 200);
    	
    	
    	
    	
    	this.setVisible(true);
    	//���ָ���Ĵ����������ԴӴ˴��ڽ��մ����¼���
    	this.addWindowListener(new windowClose());

    }
	public static void main(String[] args)
	{
		  new Demo01();

	}
	/**
	 * �������ϵ��¼�
	 * @author Administrator
	 *
	 */
	class windowClose implements WindowListener
	{

		@Override
		public void windowOpened(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowClosing(WindowEvent e) {
			  System.out.println("-----------------"+e.getSource());
			  System.exit(0);
			
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO Auto-generated method stub
			
		}
		
	}
}

