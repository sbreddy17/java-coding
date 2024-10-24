package function_demo;

import java.util.function.Function;

public class RemoveSpace {
	
	public static void main(String[] args) {
		
		String name = "bhuvan eswar reddy";
		
		Function<String, String> f = n -> n.replaceAll(" ","");
		System.out.println(f.apply(name));
		
		String msg = " w e l c o m e";
		
		System.out.println();
		
		Function<String, Integer> f1 = m -> m.length()- m.replaceAll(" ","").length();
		System.out.println(f1.apply(msg));
	}

}
