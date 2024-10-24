package string_streams_demo;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedChar {

	public static void main(String[] args) {
		String s = "aabcdeefghiii";
		Map<Character, Long> collect = s.chars().mapToObj(c -> (char) (c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(collect);

		Entry<Character, Long> entry = collect.entrySet().stream().filter(e -> e.getValue() > 1)
				// .skip(1)
				.findFirst().get();
		System.out.println(entry);
		// .map(e->e.getKey());

		// System.out.println(map);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++");

		String s1 = "cccccccccbbbbbbbssssaaannnddmmmmmmmmmmmmmmmmmmmmmmm";

				Optional<Character> map = s1.chars()
				.mapToObj(c -> (char) (c))
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.min(Map.Entry.comparingByValue())
				//.map(e->e.getKey());
				.map(Map.Entry::getKey);
				System.out.println(map);
		// .max(Map.Entry.comparingByValue())
				
				
				

	}

}
