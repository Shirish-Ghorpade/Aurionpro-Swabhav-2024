package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.model.PlayingPieceO;

public class PlayingPieceOTest {

	@Test
	void testPlayingPieceOConstructor() {
		PlayingPieceO piece = new PlayingPieceO();
		assertEquals('O', piece.getPieceType());
	}
}
