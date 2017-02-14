package AsciiTask;

import org.junit.Test;
import static org.junit.Assert.*;

public class DigitalNumbersHexTest {
	LCDPrintable target = new DigitalNumbersHex();

	@Test
	public void nullInputTest() {
		verifyEquality(null, null);
	}

	@Test
	public void digitalUnitaryTest() {
		verifyEquality("   \n  |\n  |", 1);
	}

	@Test
	public void digitalBinaryTest() {
		verifyEquality(" _ \n _|\n|_ ", 2);
	}

	@Test
	public void printZeroToNineTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println(target.convertIntToLCD(i));
		}
	}

	@Test
	public void digitalDodecaTest() {
		verifyEquality(" _ \n|  \n|_ ", 12);
	}

	@Test
	public void HexTest() {
		assertEquals(" _ \n|_|\n| |", target.convertIntToLCD(10));
	}

	@Test
	public void convertToHexTest() {
		char[] chararray = new char[] { 'b', '4' };
		assertArrayEquals(chararray, ConvertToHex.intToHex(180));
	}

	private void verifyEquality(String expected, Integer i) {
		Object digit = target.convertIntToLCD(i);
		assertEquals(expected, digit);
	}
}
