package AsciiTask;
import org.junit.Test;
import static org.junit.Assert.*;

public class AsciiTest {
	AsciiNumbers target = new AsciiNumbers();
	
	@Test
	public void nullInputTest() {
		assertEquals(null, target.convertIntToAscii(null));
	}
	
	@Test
	public void printAsciiUnitaryTest() {
		Object asciiOne = target.convertIntToAscii(1);
		assertEquals("   \n  |\n  |", asciiOne);
		System.out.println(asciiOne);
	}
	
	@Test
	public void printAsciiBinaryTest() {
		Object asciiTwo = target.convertIntToAscii(2);
		assertEquals(" _ \n _|\n|_ ", asciiTwo);
		System.out.println(asciiTwo);
	}
	
	@Test
	public void printZeroToNineTest() {
		for (int i = 0; i < 10; i++) {
			System.out.println(target.convertIntToAscii(i));	
		}
	}
	
	@Test
	public void printAsciiDodecaTest() {
		Object asciiTwelve = target.convertIntToAscii(12);
		assertEquals(" _ \n _|\n|_ ", asciiTwelve);
		System.out.println(asciiTwelve);
	}
	
	@Test
	public void printAsciiNegaTest() {
		assertEquals("      \n _   |\n     |", target.convertIntToAscii(-1));
	}
	
}
