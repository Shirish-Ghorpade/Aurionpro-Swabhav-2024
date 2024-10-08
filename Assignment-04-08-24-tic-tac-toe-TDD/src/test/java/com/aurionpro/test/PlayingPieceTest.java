package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.model.PlayingPiece;

public class PlayingPieceTest {
	@Test

	public void testGetPieceType() {
		PlayingPiece piece = new PlayingPiece('X');

		assertEquals('X', piece.getPieceType());
	}

	@Test
	void testSetPieceTest() {
		PlayingPiece piece = new PlayingPiece('X');

		piece.setPieceType('O');
		assertEquals('O', piece.getPieceType());
	}
}
