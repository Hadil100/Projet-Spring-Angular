package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

import main.Loup;
import main.Orientation;

class TestLoup {
Loup lp;
	@BeforeEach
	void setUp() throws Exception {
		lp=new Loup();
	}

	@AfterEach
	void tearDown() throws Exception {
		lp =null;
	}

	@Test
	void testPositionInitialeAuNord() {
		assertEquals(Orientation.NORD, lp.getOrientation());
	}
	@Test
	void TourneruneFois () {
		lp.tourner();
		assertEquals(Orientation.EST, lp.getOrientation());
	}
	@ParameterizedTest
	@EnumSource(Orientation.class)
	void testparametrized(Orientation o) {
		
	}
}
