package AsciiTask;

import java.util.HashMap;
import java.util.Map;

public class AsciiNumbers {

	private Digit one = new Digit(
			"   ", 
			"  |", 
			"  |");
	private Digit two = new Digit(
			" _ ", 
			" _|", 
			"|_ ");
	private Digit three = new Digit(
			" _ ",
			" _|",
			" _|");
	private Digit four = new Digit(
			"   ",
			"|_|",
			"  |");
	private Digit five = new Digit(
			" _ ",
			"|_ ",
			" _|");
	private Digit six = new Digit(
			" _ ",
			"|_ ",
			"|_|");
	private Digit seven = new Digit(
			" _ ",
			"  |",
			"  |");
	private Digit eight = new Digit(
			" _ ",
			"|_|",
			"|_|");
	private Digit nine = new Digit(
			" _ ",
			"|_|",
			" _|");
	private Digit zero = new Digit(
			" _ ",
			"| |",
			"|_|");
	
	private Map<Integer, Digit> singleDigits = new HashMap<>();
	
	public AsciiNumbers() {
		singleDigits.put(1, one);
		singleDigits.put(2, two);
		singleDigits.put(3, three);
		singleDigits.put(4, four);
		singleDigits.put(5, five);
		singleDigits.put(6, six);
		singleDigits.put(7, seven);
		singleDigits.put(8, eight);
		singleDigits.put(9, nine);
		singleDigits.put(0, zero);
	}
	
	
	public String convertIntToAscii(Integer i) {
		if (i == null) {
			return null;
		}
		
		Digit digit;
		String topLine = "";
		String midLine = "";
		String botLine = "";
		
		if (i < 0) {
			topLine += "   ";
			midLine += " _ ";
			botLine += "   ";
			i = -i;
		}
		
		int length = i.toString().length();
		for (int j = 0; j < length; j++) {
			digit = singleDigits.get(getDigitAtLocation(i, j));
			topLine += digit.top;
			midLine += digit.middle;
			botLine += digit.bottom;
		}
		
		return topLine + "\n" + midLine + "\n" + botLine;
	}


	private Integer getDigitAtLocation(Integer fullNumber, int index) {
		return Integer.valueOf(fullNumber.toString().substring(index, index+1));
	}
}

class Digit {
	String top;
	String middle;
	String bottom;
	
	public Digit(String top, String middle, String bottom) {
		this.top = top;
		this.middle = middle;
		this.bottom = bottom;
	}
}
