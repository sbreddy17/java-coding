package examples_demo;

public class DemoEx {
	
	public static void main(String[] args) {
		int number = 12345;
		int rem=0;
		int output=0;
		while(number>0) {
			rem=number%10;
			number=number/10;
			output=output*10+rem;			
		}
		System.out.println(output);
	}

}
