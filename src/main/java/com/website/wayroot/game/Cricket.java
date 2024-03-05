package com.website.wayroot.game;

public class Cricket implements GamingConsole{

	public void up() {
		System.out.println("Hit");
	}
	public void down() {
		System.out.println("Defend");
	}
	public void right() {
		System.out.println("Run");
	}
	public void left() {
		System.out.println("Stop");
	}
}
