package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExTwo {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("mahathi");
		list.add("Mahitha");
		list.add("akhiLa");
		list.add("Gayatri");
		list.add("Priya");
		list.add("Anupama");
		list.add("Sai");
		list.add("sara");

		System.out.println(list);
		System.out.println();

		System.out.println("List After filter");
		System.out.println();

		List<String> list1 = list.stream().filter(s -> s.length() >= 6).collect(Collectors.toList());
		System.out.println(list1);

		System.out.println();
		System.out.println("List after map");
		System.out.println();

		List<String> list2 = list.stream().filter(s -> s.length() >= 6).map(s -> s.toUpperCase())
				.collect(Collectors.toList());
		System.out.println(list2);
		
		long count = list.stream().count();
		
		System.out.println(count);
		
		List<String> list3 = list.stream().map(s->s.toLowerCase()).filter(s->s.charAt(0)=='a').collect(Collectors.toList());
		System.out.println(list3);
			

	}

}
