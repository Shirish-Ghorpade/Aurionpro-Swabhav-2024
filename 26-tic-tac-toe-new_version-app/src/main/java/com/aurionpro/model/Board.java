package com.aurionpro.model;


public class Board {

	Cell[] cell = new Cell[9];

	public Board() {
		super();
		for (int i = 0; i < cell.length; i++) {
			cell[i] = new Cell(MarkType.EMPTY);
		}
	}
	
	
	public Cell[] getCell() {
		return cell;
	}


	public void setCell(Cell[] cell) {
		this.cell = cell;
	}


	public boolean isBoardFull() {
		for (int i = 0; i < cell.length; i++) {
			if (cell[i].getMark() == MarkType.EMPTY)
				return false;
		}
		return true;
	}

	public void setCellMark(int loc, MarkType mark) throws CellAlreadyMarkedException{
		cell[loc].setMark(mark);
	}
}
