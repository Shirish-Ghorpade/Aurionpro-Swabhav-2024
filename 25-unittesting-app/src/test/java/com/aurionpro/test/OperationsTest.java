//package com.aurionpro.test;
//
//import static org.junit.jupiter.api.Assertions.*;
//
//import org.junit.jupiter.api.AfterEach;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//
//import com.aurionpro.model.Operations;
//
//class OperationsTest {
//
//	
//	Operations operations;
//	
//	@BeforeEach
//	void init() {
//		operations = new Operations();
//	}
//	
//	@AfterEach
//	void status() {
//		System.out.println("Test executed sucessfully");
//	}
//	@Test
//	void testAddition() {
////		Method 1
////		int actual = operations.addition(5, 5);
////		int expected=10;
////		assertEquals(expected, actual);
//		
////		Method 2
//		assertEquals(10, operations.addition(5, 5), "This function is doing addition");
//		assertEquals(7, operations.addition(2, 5), "This function is doing addition");
//		assertEquals(20, operations.addition(10, 10), "This function is doing addition");
//		assertEquals(57, operations.addition(50, 7), "This function is doing addition");
//	}
//	@Test
//	void testSubtraction() {
////		int actual = operations.subtraction(5, 5);
////		int expected=0;
////		assertEquals(expected, actual);
//		
//		assertEquals(0, operations.subtraction(5, 5), "This is doing subtraction");
//	}
//	@Test
//	void testMultiplication() {
////		int actual = operations.multiplication(5, 5);
////		int expected=25;
////		assertEquals(expected, actual);
//		assertEquals(25, operations.multiplication(5,5), "This is doing multiplication");
//	}
//	@Test
//	void testDivision() {
////		int actual = operations.divison(5, 5);
////		int expected=1;
////		assertEquals(expected, actual);
//		assertEquals(1, operations.divison(5, 5), "This is doing division");
//		assertThrows(ArithmeticException.class, ()->operations.divison(6, 0));
//	}
//	
//	@Test
//	void testIsEven() {
//		assertTrue(operations.isEven(6));
//	}
//}
