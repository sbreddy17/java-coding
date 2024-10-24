package supplier_demo;

import java.util.function.Supplier;

public class PasswordGen {
	
	public static void main(String[] args) {
		
		Supplier<String> s = ()->{
			
			String pwd ="";
			
			for(int i =1;i<=8;i++) {
				String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ@#$%&";
				Supplier<Integer> n = ()->(int)(Math.random()*10);
				Supplier<Character> c = ()->symbols.charAt((int)(Math.random()*30));
				
				if(i%2==0) {
					pwd +=n.get();
					}else {
						pwd +=c.get();
					}
				}
			return pwd;
		};
			
			System.out.println(s.get());
	}

}
