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
		String actual = target.delegateArgs(new String[] {"get", "firstName"});
		assertEquals("John", actual);
	}
	
	@Test
	public void findAddresstest() {
		String actual = target.delegateArgs(new String[] {"get", "address"});
		assertEquals("{\"streetAddress\":\"21 2nd Street\",\"city\":\"New York\",\"postalCode\":\"10021-3100\",\"state\":\"NY\"}", actual);
	}
	
}
