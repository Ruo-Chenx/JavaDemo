package com.game.ui;


import java.awt.BorderLayout;

import javax.swing.Box;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

import com.net.client.ClientUtils;
import com.net.util.Message;

public class MainFrame extends JFrame 
{
  private Game game=null;//new Game();
  private RightPanel rp=new RightPanel();
  
  private Box box=Box.createHorizontalBox();
  private String uname;
  private int types=-1;//自己是白还是黑
	public MainFrame(String name,int types)
	{
		super("五子棋_"+name.substring(1));
		this.uname=name;
		rp.setOwnName(uname);//设置自己的头像和名字
		this.types=types;
		game=new Game(types);
		
		rp.setOwnTypes(types);
		this.setSize(Config.WIDTH+300, Config.HEIGHT);
		this.setLocation(300,200);
	
		this.add(game,BorderLayout.CENTER);
		this.add(rp,BorderLayout.EAST);
	
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		new ReadServerData().start();
	}
	
	
	class ReadServerData extends Thread
	{

		@Override
		public void run() {
			 while(true)
			 {
				 Message msg=ClientUtils.pop();
				 if(msg.getType()==Message.READEY)
					{
					        rp.setOtherName(new String(msg.getMsgBody()));
					        rp.setMessage("开始对战。。。");
					        
					        if(MainFrame.this.types==Config.BLACK)
					        {
					        	game.play();//黑子优先
					        	rp.setMessage("请黑方下棋");
					        }else
					        {
					        	rp.setMessage("等待对方下棋");
					        }
					        
					}else if(msg.getType()==Message.CHAT)
					{
						rp.appendInfo(new String(msg.getMsgBody()));
						
						//rp.setMessage("等待对方连线。。。");
					}else if(msg.getType()==Message.ROWCOL)
					{
						byte[] tem=msg.getMsgBody();
						Config.map[tem[0]][tem[1]]=tem[2];
						
						if(tem[2]!=MainFrame.this.types)
						{
							game.play();
							
							if(tem[2]==Config.BLACK)
						    	rp.setMessage("白方下棋！");
						
							if(tem[2]==Config.WHITE)
								rp.setMessage("黑方下棋");
						
							
						}else
						{
							rp.setMessage("等待对方下棋");	
						}
						game.repaint();
					}else if(msg.getType()==Message.WIN)
					{
						game.stop();
						int type=msg.getMsgBody()[0];
						game.repaint();
						if(type==types)
						{
							JOptionPane.showMessageDialog(MainFrame.this, "你赢了！");
							
						}else
						{
							JOptionPane.showMessageDialog(MainFrame.this, "你输了！");
						}
						
					}else if(msg.getType()==Message.BLACK||msg.getType()==Message.WHITE)
					{
						rp.setMessage("等待对方连线.........");
					}
				 
				 
				 try {
					Thread.sleep(300);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			 }
		}
		
	}



	public static void main(String[] args) {
		
       //    new MainFrame();
	}

}
