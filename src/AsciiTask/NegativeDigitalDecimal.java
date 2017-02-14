package AsciiTask;

public class NegativeDigitalDecimal extends AbstractLCDConverter {

	public int getLength(Integer i) {
		return i.toString().length();
	}
	
	public char getDigitAtLocation(Integer fullNumber, int index) {
		return fullNumber.toString().charAt(index);
	}
}


