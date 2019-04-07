package com.game.ui;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import com.net.client.ClientUtils;
import com.net.util.Message;

public class Game extends JPanel 
{
    private BufferedImage bak=null;
    private BufferedImage black=null;
    private BufferedImage white=null;
   
     private int step=0;//步   确定谁下子
    
    private boolean isrun=false;
    private int types=-1;
    
    public Game(int types)
    {
    	this.types=types;
    	this.setSize(Config.WIDTH, Config.HEIGHT);
    	this.setLocation(0, 0);
    	try {
			bak=ImageIO.read(Game.class.getResource("/com/res/bak2.jpg"));
			black=ImageIO.read(Game.class.getResource("/com/res/black.png"));
			white=ImageIO.read(Game.class.getResource("/com/res/white.png"));
		} catch (IOException e) {
			JOptionPane.showMessageDialog(this, "加载图片资源出错!");
			e.printStackTrace();
		}
    	
    	this.addMouseListener(new playGame());
    }

	@Override
	public void paint(Graphics g) 
	{
		//画背景
		g.drawImage(bak, 0,0, null);
		//画格框
		g.setColor(new Color(142,86,29));
		for(int row=0;row<Config.ROWS;row++)
		{
			for(int col=0;col<Config.COLS;col++)
			{
				g.drawRect(Config.CELLWIDTH*col+Config.OFFSETX, Config.CELLWIDTH*row+Config.OFFSETY, Config.CELLWIDTH, Config.CELLWIDTH);
			}
		}
		//画棋
		
		for(int row=0;row<Config.ROWS;row++)
		{
			for(int col=0;col<Config.COLS;col++)
			{
				  if(Config.map[row][col]==Config.WHITE)
				  {
					  g.drawImage(white, col*Config.CELLWIDTH+Config.OFFSETX-Config.CELLWIDTH/2, row*Config.CELLWIDTH+Config.OFFSETY-Config.CELLWIDTH/2, null);
				  }
				  if(Config.map[row][col]==Config.BLACK)
				  {
					  g.drawImage(black, col*Config.CELLWIDTH+Config.OFFSETX-Config.CELLWIDTH/2, row*Config.CELLWIDTH+Config.OFFSETY-Config.CELLWIDTH/2, null);
				  }
			}
		}
		
	}

	@Override
	public Dimension getPreferredSize() {
		// TODO Auto-generated method stub
		return new Dimension(Config.WIDTH,Config.HEIGHT);
	}
    
   
	//事件处理器
	class playGame extends MouseAdapter
	{

		@Override
		public void mouseClicked(MouseEvent e) 
		{
			if(isrun)
			{
			 int row=0;//当前下子的行
		      int col=0;//当前下子的列
			//通过坐标求出数据的索引
			int x=e.getX()-Config.OFFSETX;
			int y=e.getY()-Config.OFFSETY;
			
			if(x>0&&y>0)
			{
				if(y%Config.CELLWIDTH>Config.CELLWIDTH/2)
				{
					row=y/Config.CELLWIDTH+1;
				}else
				{
					row=y/Config.CELLWIDTH;
				}
				if(x%Config.CELLWIDTH>Config.CELLWIDTH/2)
				{
					col=x/Config.CELLWIDTH+1;
				}else
				{
					col=x/Config.CELLWIDTH;
				}
				
			}
			//进行下子
			if(row>0&&col>0&&row<Config.ROWS&&col<Config.COLS&&Config.map[row][col]==Config.EMPTY)
			{
				byte[] data=new byte[]{(byte)row,(byte)col,(byte)types};
				ClientUtils.sendMsg(Message.ROWCOL, data);
				isrun=false;
			/*	if(step++%2==0)
				{
					//黑子下
					Config.map[row][col]=Config.BLACK;
				}else
				{
					//白子下
					Config.map[row][col]=Config.WHITE;
				}*/
				//画到棋盘上
				Game.this.repaint();//回调一下paint方法画组件
				//判断输赢
				//自已写，以前的算法
				isWin(row,col,types);
			}
		
		}
		}
		
	}
	/**
	 * 判断输赢
	 * @param row  //行
	 * @param col  //列
	 * @param type//黑白
	 */
	public void isWin(int row,int col,int type)
	{
		//先记住当前的行和列
		int orgrow=row;
		int orgcol=col;
		int total=1;
		//水平
		while((col+1)<Config.COLS&&(Config.map[row][col+1]==type))
		{
			total++;
			col++;
		}
		
		row=orgrow;
		col=orgcol;
		while((col-1>0)&&(Config.map[row][col-1]==type))
		{
			total++;
			col--;
		}
		
		if(win(total,type))return;
		//垂直
		row=orgrow;
		col=orgcol;
		total=1;
		while((row-1)>0&&Config.map[row-1][col]==type)
		{
			row--;
			total++;
		}
		while((row+1)<Config.ROWS&&Config.map[row+1][col]==type)
		{
			row++;
			total++;
		}
		if(win(total,type))return;
		//左上右下
		row=orgrow;
		col=orgcol;
		total=1;
		while((col-1)>0&&(row-1)>0&&Config.map[row-1][col-1]==type)
		{
			col--;
			row--;
			total++;
		}
		while((col+1)<Config.COLS&&(row+1)<Config.COLS&&Config.map[row+1][col+1]==type)
		{
			col++;
			row++;
			total++;
		}
		if(win(total,type))return;
		
		//右上左下
		row=orgrow;
		col=orgcol;
		total=1;
		while((col+1)<Config.COLS&&(row-1)>0&&Config.map[row-1][col+1]==type)
		{
			col++;
			row--;
			total++;
		}
		while((col-1)>0&&(row+1)<Config.ROWS&&Config.map[row+1][col-1]==type)
		{
			col--;
			row++;
			total++;
		}
		if(win(total,type))return;
	}
	//赢了，给服务器发消息
	public boolean win(int total,int type)
	{
		boolean re=false;
		if(total>=5)
     	{
		//发消息给服务器
			byte[]data=new byte[]{(byte)type};
			ClientUtils.sendMsg(Message.WIN, data);
		
			//JOptionPane.showMessageDialog(null, type==Config.BLACK?"黑子赢了":"白子赢了");
			//isrun=false;
			re=true;
		}
		return re;
	}
    
	public void play()
	{
		isrun=true;
	}
	public void stop()
	{
		isrun=false;
	}
	
}
