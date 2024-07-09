package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Compte;

class TestCompte {
Compte c;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	
	}

	@BeforeEach
	void setUp() throws Exception {
		c =new Compte(111,2000);
	}

	@AfterEach
	void tearDown() throws Exception {
		c=null;

	}

	@Test
	void testdeposer() {
		c.deposer(1000);
		assertEquals(3000, c.solde());
	}
	@Test
	void testretirer() {
		c.retirer(500);
		assertEquals(1500, c.solde());
	}
	@Test
	void testsolde() {
	
		assertTrue(2000==c.solde());
	}

}
