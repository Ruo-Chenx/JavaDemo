package com.part03;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JButton;
/**
 * 重绘组件
 * @author Administrator
 *
 */
public class MyButton extends JButton 
{
	Image img;
   public MyButton()
   {
	  // super();
	   this.setSize(52, 52);
	  
	   try {
		img=ImageIO.read(MyButton.class.getResource("/com/res/home.png"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
   }
   
   
@Override
public Dimension getPreferredSize() {
	// TODO Auto-generated method stub
	return new Dimension(52,52);
}


//画图形组件
@Override
public void paint(Graphics g) 
{
//	g.setColor(Color.WHITE);
	//g.fillRect(0, 0, 52, 52);
	g.drawImage(img, 0,0, null);
	
}
   
   
}
