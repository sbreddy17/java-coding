package supplier_demo;

import java.util.function.Supplier;

public class SupplierOne {
	public static void main(String[] args) {
		String names[] = {"Apple","Bat","cat","rat","mat","flat","car","bike"};
		
		Supplier<String> s = ()->{
			int x = (int)(Math.random()*8);
			return names[x];
		};
		System.out.println(s.get());
		System.out.println();
		
		
	}

}
