package interview.question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ApplicationManager {
	private NewFileCreator writer = new NewFileCreator();
	private FileCopier fileReader = new FileCopier(writer);
	
	
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

	private String get(String[] commands) {
		for (int i = 0; i < commands.length; i++) {
			String arg = commands[i];
			if (arg == "--id" || arg == "-i") {
				new JSONRepository().identifyJSON(commands[i+1]);
			}
		}
		return new JSONReader().readJson(getKeys(commands));
	}

	private void copy(String[] commands) {
		String path = commands[1];
		String fileName = commands[2];
		fileReader.readFile(path, fileName);
	}
	
	private List<String> getKeys(String[] commands) {
		List<String> commandList = new ArrayList<>();
		for (int i = 1; i < commands.length; i++) {
			commandList.add(commands[i]);
		}
		return commandList;
	}

}
