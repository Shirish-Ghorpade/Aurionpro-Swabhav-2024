package com.aurionpro.test;

import java.util.Arrays;
import java.util.Scanner;

import javax.swing.text.StyledEditorKit.BoldAction;

import com.aurionpro.model.CricketPlayer;
import com.aurionpro.model.PlayerApp;

public class PlayerAppTest {

	public static void main(String[] args) {
		
		int playerId=0;
		String name=null;
		int numberOfMatches=0;
		int runs=0;
		int numberOfWickets=0;
	
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of players ");
		int n = scanner.nextInt();
		PlayerApp players[] = new PlayerApp[n];
		
		
		System.out.println("Enter the details of the players");
		for(int i=0; i<players.length; i++) {
			System.out.println("----------------------------------------------------------------");
			
			Boolean inCorrectValue=true;
			
			System.out.println("Enter player id");
			while(inCorrectValue) {
				playerId = scanner.nextInt();
				if(playerId>0) {
					inCorrectValue=false;
				}
				else {
					System.out.println("Id should be positive");
				}
			}
			scanner.nextLine();
			inCorrectValue=true;
			System.out.println("Enter name of the player");
			while(inCorrectValue) {
				name = scanner.nextLine();
				if(name.charAt(0) != ' ') {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid name");
				}
			}
			System.out.println("Enter number of matches played by player");
			inCorrectValue=true;
			while(inCorrectValue) {
				numberOfMatches = scanner.nextInt();
				if(numberOfMatches>=0) {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid number");
				}
			}
			System.out.println("Enter runs scored by player");
			inCorrectValue=true;
			while(inCorrectValue) {
				runs = scanner.nextInt();
				if(runs>=0) {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid number");
				}
			}

			System.out.println("Enter number of wickets taken by player");
			inCorrectValue=true;
			while(inCorrectValue) {
				numberOfWickets = scanner.nextInt();
				if(numberOfWickets>=0) {
					inCorrectValue=false;
				}else {
					System.out.println("Enter the valid number");
				}
			}
			players[i] = new PlayerApp(playerId, name, numberOfMatches, runs, numberOfWickets);
		}
		
		System.out.println("---------------------------------------------");
		System.out.println("Before Sorting");
		
		for(int i=0; i<players.length; i++) {
			players[i].displayPlayers();
		}
		
		Arrays.sort(players);
		
		System.out.println("-----------------------------------------------");
		System.out.println("After Sorting");

		for(int i=0; i<players.length; i++) {
			players[i].displayPlayers();
		}
		
		PlayerApp playerApp = new PlayerApp();
		playerApp.getMaximumAveragePlayer(players);
	}

}
