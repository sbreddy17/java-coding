package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SortedEx {
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		list.add(75);
		list.add(12);
		list.add(4);
		list.add(90);
		list.add(25);
		list.add(17);
		System.out.println("Before Sorting");
		System.out.println(list);
		
		List<Integer> list1 = list.stream().sorted().collect(Collectors.toList());
		System.out.println("After Default Sorting" );
		System.out.println(list1);
		
		List<Integer> list2 = list.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
		System.out.println("After Customized Sorting");
		System.out.println(list2);
		
		List<Integer> list3 = list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList());
		System.out.println("After Customized Sorting");
		System.out.println(list3);
		
	}

}
