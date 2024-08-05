package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.aurionpro.model.Player;
import com.aurionpro.model.PlayingPiece;
import com.aurionpro.model.PlayingPieceO;
import com.aurionpro.model.PlayingPieceX;

public class PlayerTest {
	@Test
	void testSetName() {
		Player player = new Player("Player 'X'", new PlayingPieceX());
		player.setName("New Player Name");
		assertEquals("New Player Name", player.getName());
	}

	@Test
	void testSetPlayingPiece() {
		PlayingPiece piece = new PlayingPieceO();
		Player player = new Player("Player 'X'", new PlayingPieceX());
		player.setPlayingPiece(piece);
		assertEquals(piece, player.getPlayingPiece());
	}
}
