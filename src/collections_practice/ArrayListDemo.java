package collections_practice;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();
		al.add(4);al.add(10);al.add(12);al.add(3);al.add(15);al.add(8);
		
		System.out.println(al);
		System.out.println();
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");			
		}
		System.out.println();
		ListIterator<Integer> li = al.listIterator();
		while(li.hasNext()) {
			System.out.print(li.next()+" ");
		}
		System.out.println();
		while(li.hasPrevious()) {
			System.out.print(li.previous()+" ");
		}
	}

}
