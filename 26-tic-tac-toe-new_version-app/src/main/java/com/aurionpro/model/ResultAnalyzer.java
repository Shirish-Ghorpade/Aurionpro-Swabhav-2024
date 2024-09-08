package com.aurionpro.model;

public class ResultAnalyzer {
	private Board board;
	private ResultType result;

	public ResultAnalyzer(Board board, ResultType result) {
		super();
		this.board = board;
		this.result = result;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public boolean horizontalWinCheck() {
		for (int i = 0; i <= 6; i += 3) {
			if (board.cell[i].getMark() != MarkType.EMPTY && board.cell[i].getMark() == board.cell[i + 1].getMark()
					&& board.cell[i].getMark() == board.cell[i + 2].getMark()) {
				return true;
			}
		}
		return false;
	}

	public boolean verticalWinCheck() {
		for (int i = 0; i <= 2; i++) {
			if (board.cell[i].getMark() != MarkType.EMPTY && board.cell[i].getMark() == board.cell[i + 3].getMark()
					&& board.cell[i].getMark() == board.cell[i + 6].getMark()) {
				return true;
			}
		}
		return false;
	}

	public boolean diagonalWinCheck() {
		if (board.cell[0].getMark() != MarkType.EMPTY && board.cell[0].getMark() == board.cell[4].getMark()
				&& board.cell[0].getMark() == board.cell[8].getMark()) {
			return true;
		}
		if (board.cell[2].getMark() != MarkType.EMPTY && board.cell[2].getMark() == board.cell[4].getMark()
				&& board.cell[2].getMark() == board.cell[6].getMark()) {
			return true;
		}
		return false;
	}

	public ResultType analyzeResult() {
		if (horizontalWinCheck() || verticalWinCheck() || diagonalWinCheck())
			return ResultType.WIN;
		if (!board.isBoardFull())
			return ResultType.PROGRESS;
		return ResultType.DRAW;
	}
}
