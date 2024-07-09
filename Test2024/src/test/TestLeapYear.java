package test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.LeapYear;

class TestLeapYear {
LeapYear year;
@BeforeEach
void setUp() throws Exception {
year=new LeapYear();
}
@AfterEach
void tearDown() throws Exception
{
year=null;
}

	@Test
	void test() {
		assertAll("operations",
				() -> assertEquals(true, year.isLeapyear(2020)),
		() -> assertEquals(true, year.isLeapyear(2000)),
		() -> assertEquals(false, year.isLeapyear(2001)),
		() -> assertEquals(false, year.isLeapyear(1900)));
				
	}
	}


