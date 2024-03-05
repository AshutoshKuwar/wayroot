package com.website.wayroot;

import com.website.wayroot.game.Cricket;
import com.website.wayroot.game.GameRunner;
import com.website.wayroot.game.Mario;

public class AppGamingBasicJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//var game = new Mario();
var game = new Cricket();
var gamerunner = new GameRunner(game);
gamerunner.run();
	}

}
