package examples_demo;

import java.util.function.Predicate;

public class Demo {
	
	public static void main(String[] args) {
		
		Predicate<Integer> p = x->(x%2==0);
		for(int i=1;i<=100;i++) {
			if(p.test(i)) {
				System.out.println(i);
			}
		}
	}

}
