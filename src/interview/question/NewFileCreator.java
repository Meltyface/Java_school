package interview.question;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class NewFileCreator {

	public void create(String filename) {
		try {
			List<String> lines = Arrays.asList("The first line", "The second line");
			Path file = Paths.get(filename + ".txt");
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void write(String any) {

	}

}
