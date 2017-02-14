package AsciiTask;

public class DigitalNumbersHex extends AbstractLCDConverter {

	public int getLength(Integer i) {
		char[] hexCharArray = ConvertToHex.intToHex(i);
		return hexCharArray.length;
	}
	
	public char getDigitAtLocation(Integer fullNumber, int index) {
		char[] hexCharArray = ConvertToHex.intToHex(fullNumber);
		return hexCharArray[index];
	}
	
}

class ConvertToHex {

	public static char[] intToHex(Integer input) {
		return Integer.toHexString(input).toCharArray();
	}

}


