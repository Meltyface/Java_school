package interview.question;

import java.util.ArrayList;
import java.util.List;

public class ApplicationManager {
	private NewFileCreator writer = new NewFileCreator();
	private FileReader fileReader = new FileReader(writer);
	
	public String delegateArgs(String[] commands) {
		// Arg[0] will always be command word for type of action necessary.
		// Arg[0] can be copy, get
		if (commands[0] == "copy") {
			String path = commands[1];
			String fileName = commands[2];
			fileReader.readFile(path, fileName);
		} else if (commands[0] == "get") {
			return new JSONReader().readJson(getKeys(commands));
		}
		return "";
	}

	private List<String> getKeys(String[] commands) {
		List<String> commandList = new ArrayList<>();
		for (int i = 1; i < commands.length; i++) {
			commandList.add(commands[i]);
		}
		return commandList;
	}

}
