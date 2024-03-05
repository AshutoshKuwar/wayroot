package com.website.wayroot;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GamewithSpring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(var context = new AnnotationConfigApplicationContext(GameConfiguration.class);){
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		}
		
		
	}

}
