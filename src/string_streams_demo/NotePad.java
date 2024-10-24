package string_streams_demo;

import java.util.Arrays;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class NotePad {

	public static void main(String... args) {

		String ss = "bbcccdddeeee";

		Optional<Character> map = ss.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue().reversed()).skip(1).findFirst()
				.map(e -> e.getKey());
		System.out.println(map);

		Optional<Character> map2 = ss.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue()).findFirst().map(e -> e.getKey());
		System.out.println(map2);

		String sss = "ffffgggggggggabbcccddddeeeee";

		Set<Entry<Character, Long>> entrySet = sss.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet();
		System.out.println(entrySet);

		String inputString = "Hello World, How are you?";

		// Split the string using streams
		Stream<String> wordsStream = Arrays.stream(inputString.split("\\s+"));

		// Print each word
		wordsStream.forEach(System.out::println);
	}
}
