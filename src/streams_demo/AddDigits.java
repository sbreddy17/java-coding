package streams_demo;

public class AddDigits {
	
	public static void main(String[] args) {
		
		int num = 123456;
		int rem = 0;
		
		while(num>0) {
			rem = rem +num%10;
			num = num/10;
		}
		System.out.println(rem);
		
		int i = 23456;
		int temp=i;
		int rem1 =0;
		
		while(temp>0) {
			rem1 = rem1*10+temp%10;
			temp = temp/10;
		}
		System.out.println(rem1);
				
	}

}
