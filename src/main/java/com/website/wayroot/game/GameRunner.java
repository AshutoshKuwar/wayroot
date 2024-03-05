package com.website.wayroot.game;

public class GameRunner {
private GamingConsole game;
	public GameRunner(GamingConsole game) {
		// TODO Auto-generated constructor stub
		this.game = game;
	}

	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Game is : " + game);
		game.up();
		game.down();
		game.left();
		game.right();
	}

}
