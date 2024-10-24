package streams_demo;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DemoExOne {
	
public static void main(String[] args) {
	String name="AAAAAAAAAAA BBBBBBBBBBBBBB CCCCCCCCCCCCCCCCCCC aaaaaaaaaaaaaaa bbbbbbbbbbbb ccccccccccccm";

	Map<Character,Long> count = name.chars()
			.mapToObj(c->(char) c)
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

			System.out.println(count);
			
			IntStream chars = name.chars();
					Stream<Character> mapToObj = chars.mapToObj(c->(char) c);
					Map<Character, Long> collect = mapToObj.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
					System.out.println(collect);
}

}
