package demo_project;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeThree {
	
	public static void main(String[] args) {
		IntStream.rangeClosed(1, 50).filter(e->e%2==0).forEach(e->System.out.print(e+" "));
		System.out.println();
		
		List<Integer> numbers = Arrays.asList(10,11,1,1,2,3,3,4,5,5,6,7,7,8,8,9);
		
	int sum = numbers.stream().mapToInt(e->e).sum();
	System.out.println(sum);
	
	double asDouble = numbers.stream().mapToInt(e->e).average().getAsDouble();
	System.out.println(asDouble);
	
	int min = numbers.stream().mapToInt(e->e).min().getAsInt();
	System.out.println(min);
	
	int max = numbers.stream().mapToInt(e->e).max().getAsInt();
	System.out.println(max);
	System.out.println();
	
	numbers.stream().sorted().forEach(e->System.out.print(e+" "));
	System.out.println();
	
	numbers.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(e->System.out.print(e+" "));
	System.out.println();
	
	numbers.stream().sorted((i1,i2)->i2.compareTo(i1)).forEach(e->System.out.print(e+" "));
	System.out.println();
	
	numbers.stream().distinct().forEach(e->System.out.print(e+" "));
	
	String name ="BbbbHhhuvaaaNNNNnnn";
	
	Map<Character,Long> map =name.chars().mapToObj(c->(char) c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
	System.out.println(map);
	 name.chars().distinct().forEach(e->System.out.print((char)e+" "));
	
	}

}
