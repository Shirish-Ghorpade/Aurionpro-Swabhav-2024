package com.aurionpro.model;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Game {
	private Player currentPlayer;
	private Deque<Player> players;
	Board board;
	ResultAnalyzer analyzer;
	ResultType result = ResultType.PROGRESS;
	Scanner scanner = new Scanner(System.in);

	public Game() {
		super();
		this.players = new LinkedList<Player>();
		this.players.add(new Player("Player 1", MarkType.X));
		this.players.add(new Player("Player 2", MarkType.O));
		this.board = new Board();
		this.analyzer = new ResultAnalyzer(board, result);
		this.currentPlayer = players.removeFirst();
	}

	public void play(int loc) {
		try {
			board.setCellMark(loc, currentPlayer.getMark());
			printBoard();
			System.out.println();
			result = analyzer.analyzeResult();
			if (result == ResultType.PROGRESS) {
				switchCurrentPlayer();
				return;
			}
			if (result == ResultType.DRAW) {
				System.out.println("Game is draw");
				return;
			}
			System.out.println(currentPlayer.getPlayerName() + " win !");

			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public void startGame() {
		while (analyzer.analyzeResult() == ResultType.PROGRESS) {
			System.out.println(currentPlayer.getPlayerName() +" "+currentPlayer.getMark()+ " Enter the move [1-9]");
			int loc = scanner.nextInt();
			if (loc <= 0 || loc > 9) {
				System.out.println("Out of bound");
				continue;
			}
			play(loc - 1);
		}
	}

	public void switchCurrentPlayer() {
		players.add(currentPlayer);
		currentPlayer = players.removeFirst();
	}

	public Player getCurrentPlayer() {
		return currentPlayer;
	}

	public void printBoard() {
		Board board = analyzer.getBoard();
		for (int i = 0; i < 9; i++) {
			System.out.print(board.cell[i].getMark() + "\t");
			if ((i + 1) % 3 == 0)
				System.out.println();
		}
	}

}
