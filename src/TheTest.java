import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class TheTest {

	@Test
	void test() {
		TextAnalyzer test = new TextAnalyzer();
		File file = new File("src//TheRaven.txt");
		int output = test.countThe(file);
		assertEquals(56, output);
	}

}
