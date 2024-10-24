package streams_demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringCharOcc {

	public static void main(String[] args) {
		String str = "aaAA BBbb CCcc";
	
		 Map<Character, Long> charCount = str.chars()
				  .mapToObj(c -> (char) c)
				  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
				  System.out.println(charCount); 			
		 
				  String sentence ="bbhhuuVVvv AAnn EESSWWaarr";
				  
				  StringBuilder sb1 = new StringBuilder();
				  
				  sentence.chars().distinct().forEach(c->sb1.append((char)c));
				  System.out.println(sb1);
				  
		}

}
