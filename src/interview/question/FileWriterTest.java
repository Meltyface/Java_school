package interview.question;

import java.nio.file.Paths;

import org.junit.Test;

public class FileWriterTest {
	NewFileCreator target = new NewFileCreator();
	FileReader testFile = new FileReader(target);
	private static final String TEXT_FOLDER = "text_files_for_testing/";

	@Test
	public void createNewFileTest() {

		target.create(TEXT_FOLDER + "test.txt", "Long text spread across \n two lines");
		Paths.get(TEXT_FOLDER + "test.txt");

	}

	@Test
	public void copyJSONTest() {
		testFile.readFile(TEXT_FOLDER + "example.json", TEXT_FOLDER + "jsoncopy.txt");
		Paths.get(TEXT_FOLDER + "jsoncopy.txt");
	}

}
