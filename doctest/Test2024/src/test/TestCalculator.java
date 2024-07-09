package test;


import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import main.Calculator;

class TestCalculator {
Calculator cal;
@BeforeEach
void setUp() throws Exception {
cal=new Calculator();
}
@AfterEach
void tearDown() throws Exception
{
cal=null;
}

@Test
void test() {
	assertAll("operations",
			() -> assertEquals(10, cal.add(5,5)),
			() -> assertTrue(12==cal.multiply(4,3)),
			() -> assertTrue(8==cal.substruct(10,2)),
			() -> assertEquals(3, cal.divide(6,2)),
			() -> assertThrows(ArithmeticException.class, ()->cal.divide(1,0)));
}
}