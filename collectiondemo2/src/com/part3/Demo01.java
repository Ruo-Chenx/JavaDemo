package com.part3;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class Demo01 
{
	public static void main(String[] args)throws Exception
	{
		Robot robot=new Robot();//»úÆ÷ÈË
		robot.mouseMove(200, 200);
		
		robot.mousePress(MouseEvent.BUTTON1_DOWN_MASK);
		robot.mouseRelease(MouseEvent.BUTTON1_DOWN_MASK);
		
		Thread.sleep(2000);
		
	    robot.keyPress(KeyEvent.VK_A);
	    robot.keyRelease(KeyEvent.VK_A);
		
	}
}
