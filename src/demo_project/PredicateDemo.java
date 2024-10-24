package demo_project;

import java.util.function.Predicate;

public class PredicateDemo {
	
	public static void main(String[] args) {
		
		String[] names = {"Anushka","Bhavya","Charita","Apsara","Anupama","Geetha"};
		
		Predicate<String> p1 = name -> name.charAt(0)=='A';
		
		for(String name : names) {
			if(p1.test(name))
				System.out.println(name);
			
		}

		
	}

}
