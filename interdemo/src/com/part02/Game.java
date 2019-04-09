package com.part02;
/**
 * 抽像类，相当于定义一种软件功能的模版（蓝图）
 * @author Administrator
 *
 */
public abstract class Game {
	/**
	 * 初始化
	 * @param i 初始几级
	 */
   public abstract void init(int i);
   /**
    * 玩
    */
   public abstract void  play();
   /**
    * 升级游戏
    */
   public abstract void update();
   
}
