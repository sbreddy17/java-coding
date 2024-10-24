package streams.demo;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateChars {

	public static void main(String[] args) {
		String str = "hello world";

		// Create a HashMap to store character counts
		Map<Character, Integer> map1 = new HashMap<>();

		// Convert the string to character array
		char[] letters = str.toCharArray();

		// Iterate through each character in the array
		for (char c : letters) {
			// Increment the count of the character in the map
			if (map1.containsKey(c)) {
				map1.put(c, map1.get(c) + 1);
			} else {
				map1.put(c, 1);
			}
		}

		// Print duplicate characters
		for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
			}
		}
	}
}
