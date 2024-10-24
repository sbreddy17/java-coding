package examples_demo;

import java.util.Scanner;

public class CheckPrime {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int num = sc.nextInt();
		
		int count =0;
		if(num==0 || num==1) {
			System.out.println("not prime");
		}
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
				}
		}
		if(count==2) {
			System.out.println("is Prime");
		}else
			System.out.println("not prime");
	
		sc.close();
		
	}
	

}
