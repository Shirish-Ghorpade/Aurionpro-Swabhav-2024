package com.aurionpro.test;

import java.util.Scanner;

import javax.swing.plaf.metal.MetalBorders.PaletteBorder;
import javax.swing.text.PlainDocument;

import com.aurionpro.model.CricketPlayer;

public class CricketPlayerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int playerId;
		String name;
		int numberOfMatches;
		int runs;
		int numberOfWickets;
	
		
		Scanner scanner = new Scanner(System.in);
		
		CricketPlayer players[] = new CricketPlayer[3];
		
		for(int i=0; i<players.length; i++) {
			
			System.out.println("Enter player id");
			playerId = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Enter name");
			name = scanner.nextLine();
			System.out.println("Enter number of matches");
			numberOfMatches = scanner.nextInt();
			System.out.println("Enter runs");
			runs = scanner.nextInt();
			System.out.println("Enter number of wickets");
			numberOfWickets = scanner.nextInt();
			players[i] = new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
		}
		
		for(int i=0; i<players.length; i++) {
			players[0].displayPlayers();
			System.out.println("Average is "+players[0].averageCalculate());
		}
		
		
		
//		CricketPlayer cricketPlayer = new CricketPlayer();
//		
//		cricketPlayer.display();
//		
//		
//		
//		CricketPlayer cricketPlayer2 = new CricketPlayer(playerId, name, numberOfMatches, runs, numberOfWickets);
//		
//		cricketPlayer2.display();
//		
//		System.out.println("Average of player "+ cricketPlayer2.getPlayerId() +" is "+cricketPlayer2.averageCalculate());
		
		

	}

}
