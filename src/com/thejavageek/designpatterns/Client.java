package com.thejavageek.designpatterns;

public class Client {

	public static void main(String[] args) {

		Game game = new GameImpl();
		game.setHighestScore(200);
		System.out.println(game.getHighestScore());
		MementoToUser memento = game.saveGame();
		game.setHighestScore(100);
		System.out.println(game.getHighestScore());
		game.loadGame(memento);
		System.out.println(game.getHighestScore());
		
	}

}
