package AsciiTask;

public class AsciiNumbers {

	public String convertIntToAscii(Integer i) {
		if (i == null) {
			return null;
		}

		String stringToReturn = null;
		switch (i) {
		case 1:
			stringToReturn = "   \n  |\n  |\n";
			break;
		case 2:
			stringToReturn = " _ \n _|\n|_ ";
			break;
		case 3:
			stringToReturn = " _ \n _|\n _|\n";
			break;
		case 4:
			stringToReturn = "   \n|_|\n  |\n";
			break;
		case 5:
			stringToReturn = " _ \n|_ \n _|\n";
			break;
		case 6:
			stringToReturn = " _ \n|_ \n|_|\n";
			break;
		case 7:
			stringToReturn = "__ \n  |\n  |\n";
			break;
		case 8:
			stringToReturn = " _ \n|_|\n|_|\n";
			break;
		case 9: 
			stringToReturn = " _ \n|_|\n _|\n";
			break;
		case 0: 
			stringToReturn = " _ \n| |\n|_|\n";
			break;
		default:
			stringToReturn = null;
		}
		return stringToReturn;
	}

}
