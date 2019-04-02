package com.part2;

import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;

import javax.imageio.ImageIO;

/**
 * НиЭМ
 * @author Administrator
 *
 */
public class Demo08 {

	public static void main(String[] args)throws Exception {
	  Robot robot=new Robot();
	  
	  Toolkit   tool=Toolkit.getDefaultToolkit();
	  
	  BufferedImage img=robot.createScreenCapture(new Rectangle(tool.getScreenSize()));
	  
	  
	  ImageIO.write(img, "png", new File("c:\\aaaaa.png"));
	  System.out.println("Ok");

	}

}
