package interview.question;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;

import org.junit.Assert;

public class FileCopierTest {
	FileCopier target;
	NewFileCreator writer = mock(NewFileCreator.class);
	
	@Before
	public void setup() {
		this.target = new FileCopier(writer);
	}
	
	@Test
	public void emptyStringTest() {
		checkFileInvalidity("");
	}
	
	@Test
	public void givenNonexistentPathTestInvalidity() {
		checkFileInvalidity("~/Documents/repository/Java_school/nonexistentfile.txt");
	}

	private void checkFileInvalidity(String path) {
		try {
			target.readFile(path);
			Assert.fail();
		} catch(Exception e) {
			assertEquals("Incorrect path input. Run again with correct file path.", e.getMessage());
		}
	}
	
	@Test
	public void writeToTxtTest() {
		target.readFile("touch.txt");
		verify(writer).create(any(String.class), any(String.class));
		// Verifies that the mock object 'writer' used the method 'create' with a string argument.
	}
}
