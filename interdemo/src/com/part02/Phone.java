package com.part02;
/**
 * 功能的调用者
 * @author Administrator
 *
 */
public class Phone
{
   Game game;
   public Phone() {}
   public Phone(Game game) {this.game=game;}
   
   
   public void phonegame()
   {
	   System.out.println("开机。。。。");
	   game.init(2);
	   game.play();
	   game.update();
   }
   
   
}
