package com.part06;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.imageio.ImageIO;

/**
 * 完成BufferedImage到字节的转换
 * @author Administrator
 *
 */
public class Demo03 {

	public static void main(String[] args) throws Exception 
	{
		  Robot ro=new Robot();
		  BufferedImage img=ro.createScreenCapture(new Rectangle(Toolkit.getDefaultToolkit().getScreenSize()));
		  byte[] data=image2bytes(img);
		  
         FileOutputStream fo=new FileOutputStream("c:\\aaa.jpg");
         fo.write(data);
         fo.close();
         System.out.println("-------------------");
	}
	/**
	 * 将图像转为字节，
	 * @param img
	 * @return
	 * @throws IOException 
	 */
	public static byte[] image2bytes(BufferedImage img) throws IOException
	{
		ByteArrayOutputStream  bao=new ByteArrayOutputStream();
		ImageIO.write(img, "jpg", bao);
	   return bao.toByteArray();	
	}
	
	public static BufferedImage bytes2image(byte[] data) throws IOException
	{
		ByteArrayInputStream bis=new ByteArrayInputStream(data);
		BufferedImage img=ImageIO.read(bis);
		return img;
	}
}
