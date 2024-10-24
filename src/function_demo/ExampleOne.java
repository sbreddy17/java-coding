package function_demo;

import java.util.function.Function;

public class ExampleOne {
	
	public static void main(String[] args) {
		Function<String, Integer> f = s-> s.length();
		System.out.println(f.apply("Mahitha"));
		System.out.println(f.apply("Bhuvaneswar"));
		System.out.println(f.apply("Gayatri"));
		
		Function<Integer, Integer> f1 = i -> i*i;
		
		System.out.println(f1.apply(12));
		System.out.println(f1.apply(91));
	
		
		}

}
