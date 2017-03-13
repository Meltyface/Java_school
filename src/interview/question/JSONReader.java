package interview.question;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JSONReader {
	public String readJson(List<String> keys) {

		try {
			return getValue(keys.get(0), "text_files_for_testing/example.json");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	public String getValue(String key, String path) throws IOException, ParseException, FileNotFoundException {
		JSONParser parser = new JSONParser();
		JSONObject jsonObject = (JSONObject) parser.parse(new FileReader(path));

		Object value = jsonObject.get(key);
		if (value instanceof String) {
			return (String) value;
		} else if (value instanceof JSONObject) {
			return value.toString();
		} else if (value instanceof Boolean) {
			return value.toString();
		} else if (value instanceof Number) {
			// Default storage type is Long
			// JavaScript doesn't differentiate between types of number
			return value.toString();
		} else if (value instanceof Object[]) {
			return value.toString();
		}
		// Complete else if statements for Bool, number, Array objects
		// 
		
		return "";
	}

}
