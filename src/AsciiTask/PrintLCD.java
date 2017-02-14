package AsciiTask;

public class PrintLCD {
	public static void main(String[] args) {
		System.out.println(("hex".equals(args[0]) ? new DigitalNumbersHex() : new NegativeDigitalDecimal()).convertIntToLCD(Integer.valueOf(args[1])));
	}
}
