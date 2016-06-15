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
	public void test7() {
		assertEquals("", RomanApp.oneDigitConvert(10));
	}

	@Test
	public void test11() {
		assertEquals("VI", RomanApp.numberConvert(6));
	}
	
	@Test
	public void test12() {
		assertEquals("X", RomanApp.numberConvert(10));
	}
	
	@Test
	public void test13() {
		assertEquals("XIII", RomanApp.numberConvert(13));
	}
	
	@Test
	public void test14() {
		assertEquals("XV", RomanApp.numberConvert(15));
	}
	
	@Test
	public void test15() {
		assertEquals("XIX", RomanApp.numberConvert(19));
	}
	
	@Test
	public void test21() {
		assertEquals("XX", RomanApp.numberConvert(20));
	}
	
	@Test
	public void test22() {
		assertEquals("XXIV", RomanApp.numberConvert(24));
	}
	
	@Test
	public void test23() {
		assertEquals("XXIX", RomanApp.numberConvert(29));
	}
	
	@Test
	public void test24() {
		assertEquals("XXXI", RomanApp.numberConvert(31));
	}
	
	@Test
	public void test25() {
		assertEquals("XLIII", RomanApp.numberConvert(43));
	}
	
	@Test
	public void test26() {
		assertEquals("LI", RomanApp.numberConvert(51));
	}
	
	@Test
	public void test27() {
		assertEquals("LXVII", RomanApp.numberConvert(67));
	}
	
	@Test
	public void test28() {
		assertEquals("LXXVIII", RomanApp.numberConvert(78));
	}
}
