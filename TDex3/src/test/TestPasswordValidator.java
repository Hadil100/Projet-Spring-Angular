package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.PasswordValidator;

class TestPasswordValidator {

	PasswordValidator pass;
	@BeforeEach
	void setUp() throws Exception {
		pass=new PasswordValidator();
	}

	@AfterEach
	void tearDown() throws Exception {
		pass=null;
	}

	@ParameterizedTest
	@CsvSource({"ABC123, true","ABCGCCG123, true","aaa, false","aaaaaaaaaaaaa,false"})
	void testlength(String password, String verdict) {
		assertEquals(verdict, pass.isValid(password));
		
	}
	@Test
	void testpwdcontainsdigit() {
		assertEquals(false, pass.isValid("ABCcfd"));
	}

}
