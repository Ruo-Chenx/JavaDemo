package com.part02;
/**
 * ���ܵĵ�����
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
	   System.out.println("������������");
	   game.init(2);
	   game.play();
	   game.update();
   }
   
   
}
