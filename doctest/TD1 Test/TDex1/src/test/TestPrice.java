package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.Price;

class TestPrice {
Price p;
	@BeforeEach
	void setUp() throws Exception {
		p=new Price();
	}

	@AfterEach
	void tearDown() throws Exception {
		p=null;
	}

	@Test
	void testgetttcprice() {
		assertEquals(119,p.getTTCPrice(100));
	}

}
