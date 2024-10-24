package PredicateExamples;

import java.util.ArrayList;
import java.util.function.Predicate;

public class RemoveNull {
	
	public static void main(String[] args) {
		
		String[] names = {"Akhila","Gayatri","Supraja",null,"","Mahitha"};
		
		Predicate<String> p = name -> name != null && name.length() !=0;
		
		ArrayList<String> al = new ArrayList<>();
		
		for(String n : names) {
				if(p.test(n)) {
				al.add(n);
			}
		}
		System.out.println(al);
	}

}
