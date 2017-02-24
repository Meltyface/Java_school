package interview.question;
import static org.junit.Assert.assertEquals;

import java.nio.file.Files;
import java.nio.file.Path;

import org.junit.Test;


public class FileWriterTest {
	NewFileCreator target = new NewFileCreator();
	
	@Test
	public void createNewFileTest() {
		target.create("test");
	}
}
