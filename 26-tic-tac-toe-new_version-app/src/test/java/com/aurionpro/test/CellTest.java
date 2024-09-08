package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.Cell;
import com.aurionpro.model.CellAlreadyMarkedException;
import com.aurionpro.model.MarkType;

class CellTest {
	Cell cell;

	@BeforeEach
	void setUp() {
		cell = new Cell(MarkType.EMPTY);
	}

	@Test
	void testCreatedCellIsEmpty() {
		assertEquals(MarkType.EMPTY, cell.getMark());
	}

	@Test
	void testSetMark_checkIfCanMarkX() throws CellAlreadyMarkedException {
		cell.setMark(MarkType.X);
		assertEquals(MarkType.X, cell.getMark());
	}

	@Test
	void testSetMark_checkIfCanMarkO() throws CellAlreadyMarkedException {
		cell.setMark(MarkType.O);
		assertEquals(MarkType.O, cell.getMark());
	}

	@Test
	void testSetMark_throwsCellAlreadyMarkedExceptionWhenMarkedTwice() {
		assertThrows(CellAlreadyMarkedException.class, () -> {
			cell.setMark(MarkType.X);
			cell.setMark(MarkType.O);
		});
	}
}
