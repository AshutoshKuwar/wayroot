package com.website.wayroot.game;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GameConfiguration {

	@Bean
	public GamingConsole game() {
		var game = new Cricket();
		return game;
	}
	
	@Bean
	public GameRunner gamerunner(GamingConsole game) {
		var gamerun = new GameRunner(game);
		return gamerun;
	}
	
}
