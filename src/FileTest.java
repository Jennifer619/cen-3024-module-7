import static org.junit.jupiter.api.Assertions.*;

import java.io.File;

import org.junit.jupiter.api.Test;

class FileTest {

	@Test
	void test() {
		File baseFile = new File("src//TheRaven.txt");
		assertTrue(baseFile.exists());
	}

}
