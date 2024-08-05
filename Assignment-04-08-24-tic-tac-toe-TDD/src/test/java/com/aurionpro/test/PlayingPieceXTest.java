package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.model.PlayingPieceX;

public class PlayingPieceXTest {

	@Test
	void testPlayingPieceXConstructor() {
		PlayingPieceX piece = new PlayingPieceX();
		assertEquals('X', piece.getPieceType());
	}
}
