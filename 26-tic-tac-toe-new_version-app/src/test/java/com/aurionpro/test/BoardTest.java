package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.Board;
import com.aurionpro.model.Cell;
import com.aurionpro.model.CellAlreadyMarkedException;
import com.aurionpro.model.MarkType;

class BoardTest {
	Board board;

	@BeforeEach
	void setUp() {
		board = new Board();
	}

	@Test
	void testCreateBiard_allNineCellsAreEmpty() {
		for (Cell cell : board.getCell()) {
			assertTrue(cell.getMark() == MarkType.EMPTY);
		}
	}

	@Test
	void testSetCellMark_ableToMarkAtSpecificLocation() throws CellAlreadyMarkedException {
		board.setCellMark(0, MarkType.X);
		assertEquals(MarkType.X, board.getCell()[0].getMark());
	}

	@Test
	void testIsBoardFull_checkTrueIfBoardIsFull() throws CellAlreadyMarkedException {
		for (int i = 0; i < 9; i++) {
			board.setCellMark(i, MarkType.X);
		}
		assertTrue(board.isBoardFull());
	}

	@Test
	void testSetCellMark_throwsCellAlreadyMarkedExceptionIfCellMarkedTwice() {
		assertThrows(CellAlreadyMarkedException.class, () -> {
			board.setCellMark(0, MarkType.X);
			board.setCellMark(0, MarkType.O);
		});
	}
}
