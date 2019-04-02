package com.part12;

public class Demo02 {

	enum Goods
	{
		BOOK,FOOD,DRINK,PLAY
	}
	
	public static void main(String[] args) 
	{
		//Ã»¼ûµ½api
		 Goods all[]=Goods.values();
	     for(Goods g:all)
	     {
	    	 System.out.println(g);
	     }
	     System.out.println("----------------------");
	     
	     switch (Goods.BOOK) {
	     case FOOD:
			 System.out.println("23%");
			break;
		//case Goods.BOOK:
	     case BOOK:
			 System.out.println("23%");
			break;
		case DRINK:
			 System.out.println("13%");
			break;
		case PLAY:
			 System.out.println("53%");
			break;
		default:
			System.out.println("63");
			break;
		}
	}

}
