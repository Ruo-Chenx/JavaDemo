package com.part03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

public class Demo04 {

	public static void main(String[] args) throws Exception{
		
		
		BufferedImage img=ImageIO.read(new File("C:\\Users\\dell\\Desktop\\pic01.jpg"));
		int width=img.getWidth();
		int height=img.getHeight();
		
		int px=img.getRGB(30, 40);
		img.setRGB(30, 40, 0xFFFF0000);
		System.out.println(Integer.toHexString(px));
		
		
		Graphics g=img.getGraphics();
		g.setColor(Color.RED);
		//g.setFont(new Font("Î¢ÈíÑÅºÚ",Font.BOLD,50));
		g.drawString("www.xxx.com", width-120, height-120);
		
		ImageIO.write(img, "png", new File("C:\\Users\\dell\\Desktop\\pic01.jpg"));
		System.out.println("OK");
	}

}
