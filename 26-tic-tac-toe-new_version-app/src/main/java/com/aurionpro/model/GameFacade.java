package com.aurionpro.model;

public class GameFacade {
	private Game game;
	public GameFacade() {
		super();
		this.game = new Game();
	}
	public void startGame() {
		game.startGame();
	}
}
