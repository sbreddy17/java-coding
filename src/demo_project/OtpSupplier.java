package demo_project;

import java.util.function.Supplier;

public class OtpSupplier {
	
	
	
	public static void main(String[] args) {
		
		Supplier<String> s = () -> {
			String otp = "";
			
			for(int i =1; i<= 6; i++) {
				otp = otp + (int)(Math.random()*10);
				}
			return otp;
		};
		
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
	System.out.println(s.get());
		
	}

}
