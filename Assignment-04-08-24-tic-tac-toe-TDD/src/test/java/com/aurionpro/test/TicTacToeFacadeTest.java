package com.aurionpro.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.aurionpro.model.TicTacToeFacade;

public class TicTacToeFacadeTest {
	private TicTacToeFacade facade;

	@BeforeEach
	void setUp() {
		facade = new TicTacToeFacade(3);
	}

	@Test
	void TestInitialization() {
		facade.initializeGame();
		assertNotNull(facade);
	}

	@Test
	void testStartGame() {
		facade.initializeGame();
		String result = facade.startGame();
		assertNotNull(result);
	}

}
