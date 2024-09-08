package com.aurionpro.model;

public class Player {
	private String PlayerName;
	private MarkType mark;
	public Player(String playerName, MarkType mark) {
		super();
		PlayerName = playerName;
		this.mark = mark;
	}
	public String getPlayerName() {
		return PlayerName;
	}
	public void setPlayerName(String playerName) {
		PlayerName = playerName;
	}
	public MarkType getMark() {
		return mark;
	}
	public void setMark(MarkType mark) {
		this.mark = mark;
	}
}
