package streams_demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ExampleOne {
	

	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.add(5);
		l.add(7);
		l.add(13);
		l.add(76);
		l.add(24);
		l.add(54);
		l.add(17);
		l.add(21);
		l.add(10);
		System.out.println("Before Streams "+l);
		
		List<Integer> l1 = l.stream().filter(i->i%2==0).collect(Collectors.toList());
		
		System.out.println("After Stream Even Nums " +l1);
		System.out.println();
		List<Integer> l2 = l.stream().filter(i->i%2==1).collect(Collectors.toList());
		System.out.println("After Map "+ l2);
		
	}

}
