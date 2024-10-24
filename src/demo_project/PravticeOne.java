package demo_project;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PravticeOne {

	public static void main(String[] args) {

		String name = "bbbhhhhuuuuvvVVVVVAAAaaaannnnnnnabcdefghij";
		
		  name.chars()
		  .mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),
		  Collectors.counting())).forEach((k,v)->System.out.println(k+" = "+v));
		  
		  name.chars().distinct().forEach(c->System.out.print((char)c));
		  System.out.println();
		  
			
			  List<Integer> numbers = Arrays.asList(1,1,1,2,3,3,3,4,5,6,7,7,7,8,9,0);
			  
			  Set<Integer> collect =numbers.stream()
			  .filter(n->Collections.frequency(numbers, n)==1)
			  .collect(Collectors.toSet()); System.out.println(collect);
			 
		  
			/*
			 * List<Integer> numbers = Arrays.asList(1,1,1,2,3,3,3,4,5,6,7,7,7,8,9,0);
			 * 
			 * List<Integer> collect = numbers.stream()
			 * .filter(n->Collections.frequency(numbers, n)==1)
			 * .collect(Collectors.toList());
			 * 
			 * System.out.println(collect);
			 */
		  
		  
		  numbers.stream().distinct().forEach(n->System.out.print(n+ "  "));
		 
		  
		  
		  
		  


	}

}
