package com.aurionpro.model;

import java.util.ArrayList;

public class PlayerApp implements Comparable<PlayerApp>{
	private int playerId;
	private String name;
	private int numberOfMatches;
	private int runs;
	private int numberOfWickets;
	private double average;
	
	public PlayerApp() {
		playerId=0;
		name="Dummy Name";
		numberOfMatches = 0;
		runs=0;
		numberOfWickets=0;
	}
	public PlayerApp(int playerId, String name, int numberOfMatches, int runs, int numberOfWickets) {
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
	
	public double getAverage() {
		return average;
	}
	public void setAverage(int average) {
		this.average = average;
	}
	public void averageCalculate() {
		if(numberOfMatches==0) {
			System.out.println("Average could not be calculated");
		}
		else{
			this.average = ((this.runs*1.0)/this.numberOfMatches);
		}
		
	}
	public int compareTo(PlayerApp o) {
		return (int) (this.average-o.average);
	}
	public void displayPlayers() {
		System.out.println("------------------------------------------------------------------");
		System.out.println("Player Id is "+this.playerId);
		System.out.println("Player name is "+this.name);
		System.out.println("Player number of matches is "+this.numberOfMatches);
		System.out.println("Runs is "+runs);
		System.out.println("Player's number of wickets is "+this.numberOfWickets);
		averageCalculate();
		System.out.println("Average is "+this.average);
	}
	public void getMaximumAveragePlayer(PlayerApp players[]) {
		int n=players.length;
		double max = players[n-1].getAverage();
		
		ArrayList<Integer>maximumAveragePlayers = new ArrayList<>();
		for(int i=n-1; i>=0; i--) {
			if(players[i].getAverage()==max) {
				maximumAveragePlayers.add(players[i].getPlayerId());
			}
		}
		System.out.println("This players ");
		for(int i=0; i<maximumAveragePlayers.size(); i++) {
			System.out.print(maximumAveragePlayers.get(i)+", ");
		}
		System.out.println(" have maximum average "+max);
	}
}
