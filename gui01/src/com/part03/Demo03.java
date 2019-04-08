package com.part03;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Demo03 {

	public static void main(String[] args) {
		//����BufferedImage����������һ��Image��ͼ�����ݵķ��ʵĻ�����.
		BufferedImage img=new BufferedImage(600, 400, BufferedImage.TYPE_INT_RGB);
		Graphics g=img.getGraphics();
		g.setColor(Color.ORANGE);
		g.fillRect(0, 0, 600,400);
		
		g.setColor(new Color(255,255,255));
		g.drawRect(50, 50, 100, 60);
		
		g.setColor(Color.black);
		g.drawLine(0, 0, 600, 400);
		
		g.setColor(new Color(0xFF,0xFF,0xFF));
		g.setFont(new Font("΢���ź�",Font.BOLD,24));
		g.drawString("��Һ�", 100, 150);
		
		try {
			Image home=ImageIO.read(Demo02.class.getResource("/com/res/home.png"));
			g.drawImage(home, 400, 300, null);
		
		
		    ImageIO.write(img, "png", new File("F:/winter holiday/gui01/src/com/res/home.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Ok");
	}

}
