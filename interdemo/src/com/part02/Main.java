package com.part02;

public class Main {

	public static void main(String[] args) {
		 Game game1=new ChessGame();
		 Phone phone=new Phone(game1);
		 
		 phone.phonegame();
		 
		 System.out.println("--------------");
		 
		 new Phone(new Game() {

			@Override
			public void init(int i) {
				// TODO Auto-generated method stub
				System.out.print("@@@"+i);
			}

			@Override
			public void play() {
				// TODO Auto-generated method stub
				System.out.print("**");
			}

			@Override
			public void update() {
				System.out.print(">>");
				
			}
		}).phonegame();

	}

}
