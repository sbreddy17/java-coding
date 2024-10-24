package demo_project;

public class ArmstrongNumber {
	
	public static void isArmstrong(int num) {
		
		int rem =0;
		int cube =0;
		int t = num;
		
		while(num > 0) {
			
			rem = num%10;
			num = num/10;
			cube = cube+(rem*rem*rem);
		}
		System.out.println(num);
		System.out.println(cube);
		if(t==cube)
			System.out.println("given number is ArmStrong");
		else
			System.out.println("Not Armstrong");
	}
	
	public static void main(String[] args) {
		
		isArmstrong(153);
		
	}

}
