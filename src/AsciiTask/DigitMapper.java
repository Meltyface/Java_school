package AsciiTask;

import java.util.HashMap;
import java.util.Map;

public class DigitMapper {
		private static Digit one = new Digit(
				"   ",
				"  |",
				"  |");
		private static Digit two = new Digit(
				" _ ",
				" _|",
				"|_ ");
		private static Digit three = new Digit(
				" _ ",
				" _|",
				" _|");
		private static Digit four = new Digit(
				"   ",
				"|_|",
				"  |");
		private static Digit five = new Digit(
				" _ ",
				"|_ ",
				" _|");
		private static Digit six = new Digit(
				" _ ",
				"|_ ",
				"|_|");
		private static Digit seven = new Digit(
				" _ ",
				"  |",
				"  |");
		private static Digit eight = new Digit(
				" _ ",
				"|_|",
				"|_|");
		private static Digit nine = new Digit(
				" _ ",
				"|_|",
				" _|");
		private static Digit zero = new Digit(
				" _ ",
				"| |",
				"|_|");
		private static Digit alpha = new Digit(
				" _ ",
				"|_|",
				"| |");
		private static Digit beta = new Digit(
				"   ",
				"|_ ",
				"|_|");
		private static Digit gamma = new Digit(
				" _ ",
				"|  ",
				"|_ ");
		private static Digit delta = new Digit(
				"   ",
				" _|",
				"|_|");
		private static Digit epsilon = new Digit(
				" _ ",
				"|_ ",
				"|_ ");
		private static Digit zeta = new Digit(
				" _ ",
				"|_ ",
				"|  ");

		private static Map<Character, Digit> singleDigits = new HashMap<>();

		
		static {
			singleDigits.put('1', one);
			singleDigits.put('2', two);
			singleDigits.put('3', three);
			singleDigits.put('4', four);
			singleDigits.put('5', five);
			singleDigits.put('6', six);
			singleDigits.put('7', seven);
			singleDigits.put('8', eight);
			singleDigits.put('9', nine);
			singleDigits.put('0', zero);
			singleDigits.put('a', alpha);
			singleDigits.put('b', beta);
			singleDigits.put('c', gamma);
			singleDigits.put('d', delta);
			singleDigits.put('e', epsilon);
			singleDigits.put('f', zeta);
		}
		
		public static Digit getDigit(char i) {
			return singleDigits.get(i);
		}
}
