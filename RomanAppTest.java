package src;

import static org.junit.Assert.*;

import org.junit.Test;

public class RomanAppTest {

	@Test
	public void test1() {
		assertEquals("V", RomanApp.oneDigitConvert(5));
	}
	
	@Test
	public void test2() {
		assertEquals("III", RomanApp.oneDigitConvert(3));
	}
	
	@Test
	public void test3() {
		assertEquals("II", RomanApp.oneDigitConvert(2));
	}
	
	@Test
	public void test4() {
		assertEquals("I", RomanApp.oneDigitConvert(1));
	}
	
	@Test
	public void test5() {
		assertEquals("IV", RomanApp.oneDigitConvert(4));
	}
	
	@Test
	public void test6() {
		assertEquals("VI", RomanApp.oneDigitConvert(6));
	}

}
