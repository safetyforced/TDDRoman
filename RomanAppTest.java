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
	
	@Test
	public void test11() {
		assertEquals(4, RomanApp.findLength(6293));
	}

	@Test
	public void test12() {
		assertEquals(9, RomanApp.findLength(865656987));
	}
	
	@Test
	public void test13() {
		assertEquals(5, RomanApp.findLength(92873));
	}
	
	@Test
	public void test21() {
		assertEquals(9, RomanApp.isolateDigit(72963, 3));
	}
	
	@Test
	public void test22() {
		assertEquals(7, RomanApp.isolateDigit(74037, 1));
	}
	
	@Test
	public void test23() {
		assertEquals(4, RomanApp.isolateDigit(483772, 6));
	}
	
	@Test
	public void test31() {
		assertEquals("DCCVII", RomanApp.numberConvert(707));
	}
}
