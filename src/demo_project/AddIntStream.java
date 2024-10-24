package demo_project;

import java.util.function.Function;
import java.util.stream.Collectors;

public class AddIntStream {
	
	public static void main(String[] args) {
		
		String name ="bbbnnnnuuuubhhhhhhuuuuuvvvaaaaannnnn";
		
		StringBuilder name1= new StringBuilder();
		
		name.chars().distinct().forEach(c->name1.append((char)c));
		System.out.println(name1);
		
		name.chars()
		.mapToObj(c->(char)c)
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).
		forEach((k,v)->System.out.print(k+"="+v+" "));
		
		
		
	}

}
