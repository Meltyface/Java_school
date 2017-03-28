package interview.question;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationManager {
	private NewFileCreator writer = new NewFileCreator();
	private FileCopier fileReader = new FileCopier(writer);
	private JSONRepository repository = new JSONRepository();
	
	public String delegateArgs(String[] commands) {
		// Arg[0] will always be command word for type of action necessary.
		// Arg[0] can be copy, get
		List<String> commandsList = Arrays.asList(commands);
		
		if (commandsList.contains("copy")) {
			copy(commands);
			return "";
		} else if (commandsList.contains("get")) {
			return get(commands);
		} 

		throw new RuntimeException();
	}
	
	private void copy(String[] commands) {
		String path = commands[1];
		fileReader.readFile(path);
	}
	
	private String get(String[] commands) {
		File file = null;
		for (int i = 0; i < commands.length; i++) {
			String arg = commands[i];
			if (arg == "--id" || arg == "-i") {
				file = repository.identifyJSON(commands[i+1]);
			}
		}
		return new JSONReader().readJson(getKeys(commands), file.getPath());
	}

	private List<String> getKeys(String[] commands) {
		List<String> commandList = new ArrayList<>();
		for (int i = 1; i < commands.length; i++) {
			commandList.add(commands[i]);
		}
		return commandList;
	}

}
