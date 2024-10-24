package collections_practice;

import java.util.Set;
import java.util.TreeSet;

public class CollectionsDemo {

	/*
	 * Set<Integer> set = new TreeSet<>(); set.add(5); set.add(1); set.add(6);
	 * set.add(3); set.add(8); set.add(11); set.add(15); set.add(1);
	 * 
	 * set.add(null); set.add(null);
	 * 
	 * set.add(25); //set.add(null); set.add(17); System.out.println(set);
	 */

	public static void main(String[] args) {
		Set<String> set1 = new TreeSet<>();
		set1.add("mahi");
		set1.add("Akki");
	//	set1.add(null);
		set1.add("anu");
		set1.add("Appu");
		set1.add("vani");
		set1.add("Supriya");
		set1.add("Teju");
		/*
		 * set1.add(null); set1.add(null);
		 */
		set1.add("Gayatri");
		System.out.println(set1);

	}

}
