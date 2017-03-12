package interview.question;

import java.io.FileReader;
import java.util.List;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class JSONReader {
	public String readJson(List<String> keys) {
		JSONParser parser = new JSONParser();

		try {

			JSONObject jsonObject = (JSONObject) parser.parse(new FileReader("text_files_for_testing/example.json"));

			Object value = jsonObject.get(keys.get(0));
			if (value instanceof String) {
				return (String) value;
			} else if (value instanceof JSONObject) {
				return value.toString();
			} else if (value instanceof Boolean) {
				return value.toString();
			} else if (value instanceof Integer) {
				return value.toString();
			} else if (value instanceof String[]) {
				return value.toString();
			}
			// Complete else if statements for Bool, number, Array objects
			// 
			
			return "";
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

}
