package test;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Hello;

class TestHello {
	Hello h;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Hi all tests");
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Bye all tests");
	}

	@BeforeEach
	void setUp() throws Exception {
		System.out.println("Hi each test");
		 h= new Hello();
	}

	@AfterEach
	void tearDown() throws Exception {
		System.out.println("Bye each test");
	h= null;
	}

	@Test
	void testGetMessage() {
		System.out.println("Test is running");
		assertEquals("Hello JUnit 5 from GI3", h.getMessage(" from GI3"));
		
	}
	@Test
	void testGetMessage1() {
		System.out.println("Test is running");
		assertEquals("Hello JUnit 5 from GI3", h.getMessage(" from GI3"));
		
	}

}
