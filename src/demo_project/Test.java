package demo_project;

import java.util.ArrayList;

public class Test {
	
	private Test() {
		
	}
	
	private static Test t1 = null;
	
	public static Test getTest() {
		if(t1 == null) {
			 t1 = new Test();
		}
		return t1;
	}
	
	public static void main(String[] args) {
		Test t1 = Test.getTest();
		Test t2 = Test.getTest();
		Test t3 = Test.getTest();
		Test t4 = Test.getTest();
		
		System.out.println(t1.hashCode());
		System.out.println(t2.hashCode());
		System.out.println(t3.hashCode());
		System.out.println(t4.hashCode());

		ArrayList<String> names = new ArrayList<>();
		names.add("sunny");
		names.add("bunny");
		names.add(null);
		System.out.println(names);
	}
	
	
	
	

}
