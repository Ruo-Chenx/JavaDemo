package com.xzy;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Game extends JPanel
{
   private BufferedImage  bak;
   private BufferedImage  black;
   private BufferedImage  white;
   
   private int step=0;//偶为黑
   
   
   public Game()
   {
	   this.setSize(Config.WIDTH, Config.HEIGHT);
	   this.initImg();
	   
	   //加事件
	   this.mouseAction();
   }
   //事件
   public void mouseAction()
   {
	  this.addMouseListener(new MouseAdapter() {

		@Override
		public void mouseClicked(MouseEvent e) {
			if(e.getButton()==MouseEvent.BUTTON1&&(e.getX()-Config.OFFSETX)>=0&&(e.getY()-Config.OFFSETY)>=0)
			{
				int xr=e.getX()-Config.OFFSETX;
				int yr=e.getY()-Config.OFFSETY;
				
				int col=xr%Config.CELL >= Config.CELL/2  ?   xr/Config.CELL+1  :  xr/Config.CELL;
				int row=yr%Config.CELL>=Config.CELL/2?yr/Config.CELL+1:yr/Config.CELL;
				if(row>0 && row<Config.ROWS-1 && col>0 && col<Config.COLS-1 && (Config.MAP[row][col]==Config.FOCUS||Config.MAP[row][col]==Config.EMPTY) )
				{
					Config.MAP[row][col]=step++%2==0?Config.BLACK:Config.WHITE;
					Game.this.repaint();
					checkWin(row, col);
				}
				
			}
			
		}
		  
	}); 
   }
   //实始化图片
   public void initImg()
   {
	   try {
		bak=ImageIO.read(Game.class.getResource("/com/res/bak.png"));
		black=ImageIO.read(Game.class.getResource("/com/res/black.png"));
		white=ImageIO.read(Game.class.getResource("/com/res/white.png"));
	} catch (IOException e) {
		 System.out.println("ERROR_001_初始化图片失败");
	}
   }
@Override
public void paint(Graphics g) {
	// TODO Auto-generated method stub
	super.paint(g);
	g.drawImage(bak, 0, 0, null);
	
	//画线
	for(int i=0;i<Config.ROWS;i++)
	{
		for(int j=0;j<Config.COLS;j++)
		{
			g.setColor(new Color(137,92,44));
			g.drawRect(j*Config.CELL+Config.OFFSETX, i*Config.CELL+Config.OFFSETY, Config.CELL, Config.CELL);
		}
	}
	//画焦点
	for(int i=0;i<Config.ROWS;i++)
	{
		for(int j=0;j<Config.COLS;j++)
		{
			if(Config.MAP[i][j]==Config.FOCUS)
			{
				g.setColor(new Color(137,92,44));
				g.fillRect(j*Config.CELL+Config.OFFSETX-5, i*Config.CELL+Config.OFFSETY-5, 10, 10);
			}
		}
	}
	
	//画子
		for(int i=0;i<Config.ROWS;i++)
		{
			for(int j=0;j<Config.COLS;j++)
			{
				if(Config.MAP[i][j]==Config.BLACK)
				{
				   g.drawImage(black, Config.CELL*j+Config.OFFSETX-20, i*Config.CELL+Config.OFFSETY-20, null);
				  
				}
				if(Config.MAP[i][j]==Config.WHITE)
				{
				   g.drawImage(white, Config.CELL*j+Config.OFFSETX-20, i*Config.CELL+Config.OFFSETY-20, null);
				  
				}
			}
		}
		
   //画提拉
		g.setFont(new Font("微软雅黑",Font.BOLD,24));
		g.setColor(step%2==0?Color.black:Color.white);
		g.drawString(step%2==0?"黑子下":"白子下", 640, 80);
}
/**
 * 
 * @param row
 * @param col
 */
public void checkWin(int row,int col)
{
     int orgrow=row,orgcol=col;
     int total=1;
     int type=Config.MAP[row][col];//当前子的类型
     //横线
     while(row-1>0 && row+1<Config.ROWS &&Config.MAP[row][col+1]==type)
     {
    	 col++;
    	 total++;
     }
     row=orgrow;
     col=orgcol;
     while(row-1>0 && row+1<Config.ROWS &&Config.MAP[row][col-1]==type)
     {
    	 col--;
    	 total++;
     }
     //竖线
     while(col-1>0 && col+1<Config.COLS && Config.MAP[row+1][col]==type)
     {
    	 row++;
    	 total++;
     }
     row=orgrow;
     col=orgcol;
     while(col-1>0 && col+1<Config.COLS && Config.MAP[row-1][col]==type)
     {
    	 row--;
    	 total++;
     }
     
     //左斜线
     while(col+1<=Config.COLS-1  &&  row-1>0  &&  Config.MAP[row-1][col+1]==type)
     {
    	 col++;
    	 row--;
    	 total++;
     }
     row=orgrow;
     col=orgcol;
     while(col-1>0  &&  row+1<=Config.ROWS  &&  Config.MAP[row+1][col-1]==type)
     {
    	 row++;
    	 col--;
    	 total++;
     }
     //右斜线
     while(col-1>0 && row-1>0 && Config.MAP[row-1][col-1]==type)
     {
    	 col--;
    	 row--;
    	 total++;
     }
     row=orgrow;
     col=orgcol;
     while(col+1<Config.COLS  &&  row+1<Config.ROWS  &&  Config.MAP[row+1][col+1]==type) {
    	 col++;
    	 row++;
    	 total++;
     }
     total(total,type); 
}
public static void total(int total,int type) {
	// TODO Auto-generated method stub
	if(total>=5) {
   	 JOptionPane.showMessageDialog(null, Config.BLACK==type?"黑子赢":"白子赢");
   	 int re=JOptionPane.showConfirmDialog(null, "是否重新来");
   	 if(re==JOptionPane.YES_OPTION)System.exit(0);
    }
	total=1;
}
@Override
public Dimension getPreferredSize() {
	// TODO Auto-generated method stub
	return new Dimension(Config.WIDTH, Config.HEIGHT);
}  
}
