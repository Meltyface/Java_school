package interview.question;

public class Main {
	
	public static void main(String[] args) {
		NewFileCreator writer = new NewFileCreator();
		FileReader fileReader = new FileReader(writer);
		String path = args[0];
		String fileName = args[1];
		fileReader.readFile(path, fileName);
	}

}
