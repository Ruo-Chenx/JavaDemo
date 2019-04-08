package com.part03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Random;

import javax.imageio.ImageIO;

/*
 * 
 * 画十张图形验证码
 */
public class Demo06 {

	public static void main(String[] args)throws Exception
	{
		BufferedImage img=new BufferedImage(130, 40, BufferedImage.TYPE_INT_RGB);
		Graphics g= img.getGraphics();
		//画图
		g.setColor(new Color(0xCC,0xCC,0xCC));
		g.fillRect(0, 0,130, 40);
		
		
		//画上很多条干扰线
		Random rand=new Random();
		for(int i=0;i<80;i++)
		{
			Color c=new Color(160+rand.nextInt(50),100+rand.nextInt(50),100+rand.nextInt(50));
			g.setColor(c);
			g.drawLine(rand.nextInt(130), rand.nextInt(40), rand.nextInt(130), rand.nextInt(40));
		}
		
		//画字
		
		g.setColor(Color.red);
		g.setFont(new Font("微软雅黑",Font.BOLD,24));
		g.drawString("中", 50, 20);
		
		
		
		ImageIO.write(img, "png",new File("C:\\Users\\dell\\Desktop\\pic02.jpg"));
		System.out.println("ok");
		
		

	}

}
