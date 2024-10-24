package streams.demo;

import java.util.LinkedHashMap;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class RepeatedAndNotRepeated {
	
	public static void main(String[] args) {
		String name = "bhuvaneswara reddy";
		
		LinkedHashMap<Character, Long> collect = name.chars()
				.mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(collect);
		
		Optional<Character> findFirst = collect.entrySet().stream().filter(k->k.getValue()==1).map(e->e.getKey()).findFirst();
		if(findFirst.isPresent()) {
			System.out.println(findFirst.get());
		}
		else {
			System.out.println("No Key");
		}
		
		Optional<Character> findFirst1 = collect.entrySet().stream().filter(k->k.getValue()>1).map(e->e.getKey()).skip(1).findFirst();
		if(findFirst1.isPresent()) {
			System.out.println(findFirst1.get());
		}
		else {
			System.out.println("No Key");
			
			String input ="My name is bhuvaneswar reddy";
			Optional<Character> findFirst2 = input.chars()
			.mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
			.entrySet().stream().filter(e->e.getValue()>1).map(e->e.getKey()).findFirst();
			
	}
		
		

}
}
