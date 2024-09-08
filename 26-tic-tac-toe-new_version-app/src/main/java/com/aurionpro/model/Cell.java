package com.aurionpro.model;

public class Cell {
	private MarkType mark;

	public Cell(MarkType mark) {
		super();
		this.mark = mark;
	}

	public MarkType getMark() {
		return mark;
	}

	public void setMark(MarkType mark) {
		if (this.getMark() != MarkType.EMPTY)
			throw new CellAlreadyMarkedException();
		this.mark = mark;
	}
}
