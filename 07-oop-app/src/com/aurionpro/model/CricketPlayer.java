package com.aurionpro.model;

public class CricketPlayer {
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	private double average;
	
	public CricketPlayer() {
		playerId=0;
		name="Dummy Name";
		numberOfMatches = 0;
		runs=0;
		numberOfWickets=0;
		average=0;
	}
	public CricketPlayer(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
		this.playerId=playerId;
		this.name=name;
		this.numberOfMatches = numberOfMatches;
		this.runs=runs;
		this.numberOfWickets=numberOfWickets;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfMatches() {
		return numberOfMatches;
	}

	public void setNumberOfMatches(int numberOfMatches) {
		this.numberOfMatches = numberOfMatches;
	}

	public int getRuns() {
		return runs;
	}

	public void setRuns(int runs) {
		this.runs = runs;
	}

	public int getNumberOfWickets() {
		return numberOfWickets;
	}

	public void setNumberOfWickets(int numberOfWickets) {
		this.numberOfWickets = numberOfWickets;
	}
	
	public double averageCalculate() {
		average = ((runs*1.0)/numberOfMatches);
		return average;
	}
	public void displayPlayers() {
		System.out.println("Player Id is "+playerId);
		System.out.println("Player name is "+name);
		System.out.println("Player number of matches is "+numberOfMatches);
		System.out.println("Runs is "+runs);
		System.out.println("Player's number of wickets is "+numberOfWickets);
	}

	

}
