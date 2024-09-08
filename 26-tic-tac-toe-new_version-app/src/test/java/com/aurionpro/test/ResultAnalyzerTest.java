package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.Board;
import com.aurionpro.model.MarkType;
import com.aurionpro.model.ResultAnalyzer;
import com.aurionpro.model.ResultType;

class ResultAnalyzerTest {

	ResultAnalyzer analyzer;
	Board board;

	@BeforeEach
	void init() {
		board = new Board();
		analyzer = new ResultAnalyzer(board, ResultType.PROGRESS);
	}

	@Test
	void testHorizontalWinCheck_firstRowWin() {
		board.setCellMark(0, MarkType.X);
		board.setCellMark(1, MarkType.X);
		board.setCellMark(2, MarkType.X);
		assertTrue(analyzer.horizontalWinCheck());
	}
	
	@Test
	void testHorizontalWinCheck_secondRowWin() {
		board.setCellMark(3, MarkType.X);
		board.setCellMark(4, MarkType.X);
		board.setCellMark(5, MarkType.X);
		assertTrue(analyzer.horizontalWinCheck());
	}
	@Test
	void testHorizontalWinCheck_thirdRowWin() {
		board.setCellMark(6, MarkType.X);
		board.setCellMark(7, MarkType.X);
		board.setCellMark(8, MarkType.X);
		assertTrue(analyzer.horizontalWinCheck());
	}
	@Test
	void testHorizontalWinCheck_firstColumnWin() {
		board.setCellMark(0, MarkType.X);
		board.setCellMark(3, MarkType.X);
		board.setCellMark(6, MarkType.X);
		assertTrue(analyzer.verticalWinCheck());
	}
	
	@Test
	void testHorizontalWinCheck_secondColumnWin() {
		board.setCellMark(1, MarkType.X);
		board.setCellMark(4, MarkType.X);
		board.setCellMark(7, MarkType.X);
		assertTrue(analyzer.verticalWinCheck());
	}
	@Test
	void testHorizontalWinCheck_thirdColumnWin() {
		board.setCellMark(2, MarkType.X);
		board.setCellMark(5, MarkType.X);
		board.setCellMark(8, MarkType.X);
		assertTrue(analyzer.verticalWinCheck());
	}

}
