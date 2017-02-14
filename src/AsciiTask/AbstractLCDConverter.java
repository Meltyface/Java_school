package AsciiTask;

public abstract class AbstractLCDConverter implements LCDPrintable {

	private Digit negativeCheck(Integer i) {
		return i < 0 ? new Digit(
				"   ",
				" _ ",
				"   ") : new Digit("","","");
	}
	
	public abstract int getLength(Integer i);
	
	public abstract char getDigitAtLocation(Integer fullNumber, int index);
	
	public String convertIntToLCD(Integer i) {
		if (i == null) {
			return null;
		}
		
		Digit digit = negativeCheck(i);
		
		if (i < 0)
			i = -i;
		
		Digit numeral;
		
		for (int j = 0; j < getLength(i); j++) {
			numeral = DigitMapper.getDigit(getDigitAtLocation(i, j));
			digit.top += numeral.top;
			digit.middle += numeral.middle;
			digit.bottom += numeral.bottom;
		}
		
		return digit.top + '\n' + digit.middle + '\n' + digit.bottom;
	}
	
}