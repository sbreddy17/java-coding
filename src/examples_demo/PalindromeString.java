package examples_demo;

public class PalindromeString {

	public static void main(String[] args) {
		String input = "Madam arora teaches malayalam malayalam";
		String[] words = input.split(" ");

		for (String word : words) {
			String revWord = "";
			for (int i = word.length() - 1; i >= 0; i--) {
				revWord = revWord + word.charAt(i);
				}
			if(word.equals(revWord)) {
            	System.out.println(revWord);
            
			}
			}
	}
}
