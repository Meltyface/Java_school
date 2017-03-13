package interview.question;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileCopier {
	private NewFileCreator writer;
	
	public FileCopier(NewFileCreator writer) {
		this.writer = writer;
	}
	
	private static final String fileNotFoundMessage = "Incorrect path input. Run again with correct file path.";

	public void readFile(String path, String fileName) {		
		String fileData = validate(path);
		writer.create(fileName, fileData);
	}

	private String validate(String path) {
		try {
			return new String(Files.readAllBytes(Paths.get(path)));			
		} catch(IOException e) {
			// IOException is checked exception
			throw new RuntimeException(fileNotFoundMessage);
		}
	}
	
}
