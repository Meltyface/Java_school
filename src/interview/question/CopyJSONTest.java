package interview.question;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class CopyJSONTest {
	private static final String TEXT_FOLDER = "text_files_for_testing/";

	@Test
	public void copyAndRelocateTest() throws Exception {
		// System tests (often written by product owner) are high-level
		// Behaviour-driven development

		String shortTestFile = TEXT_FOLDER + "system_test_file.txt";
		String longTestFile = TEXT_FOLDER + "example.json";
		assertCopied(longTestFile);
		assertCopied(shortTestFile);

	}

	@Test
	public void invalidPathTest() {
		try {
			Main.main(new String[] { "copy", "dfgdf", "jqaxc" });
		} catch (RuntimeException e) {
			assertEquals("Incorrect path input. Run again with correct file path.", e.getMessage());
		}
	}

	private void assertCopied(String testFilePath) throws IOException {
		String outputPath = "output_folder/copyAndRelocateOutput.txt";
		Main.main(new String[] { "copy", testFilePath, outputPath });
		assertTrue(compareFiles(testFilePath, outputPath));
	}

	private Boolean compareFiles(String sourcePath, String destPath) throws IOException {
		String contentSource = new String(Files.readAllBytes(Paths.get(sourcePath)));
		String contentDest = new String(Files.readAllBytes(Paths.get(destPath)));
		return contentSource.equals(contentDest);
	}

}
