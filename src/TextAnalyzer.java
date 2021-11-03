import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class TextAnalyzer {
	public static void main(String args[]) {
		Map<String, Integer> wordMap = buildWordMap("C:/users/David/documents/MacBeth.txt");
		List<Entry<String, Integer>> list = sortByValueInDecreasingOrder(wordMap);
		System.out.println("List of repeated words");
		for (Map.Entry<String, Integer> entry : list) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " => " + entry.getValue());
			}
		}
	}

	private static List<Entry<String, Integer>> sortByValueInDecreasingOrder(Map<String, Integer> wordMap) {
		// TODO Auto-generated method stub
		return null;
	}

	private static Map<String, Integer> buildWordMap(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}
