package interview.question;

import static org.junit.Assert.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.junit.Test;

public class GetJSONTest {
	private static final String TEXT_FOLDER = "text_files_for_testing/";
	
	ApplicationManager target = new ApplicationManager();
	
	@Test
	public void findNametest() {
		findX("firstName", "John");
	}
	
	@Test
	public void findAddresstest() {
		findX("address", "{\"streetAddress\":\"21 2nd Street\",\"city\":\"New York\",\"postalCode\":\"10021-3100\",\"state\":\"NY\"}");
	}
	
	@Test
	public void findNumbertest() {
		findX("age", "25");
	}
	
	@Test
	public void findBooltest() {
		findX("isAlive", "true");
	}

	private void findX(String key, String expected) {
		assertEquals(expected, target.delegateArgs(new String[] {"get", key}));
	}
}
