package demo_project;

import java.util.Scanner;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number ");
		
		int number = sc.nextInt();
		int count = 0;
		
		
		for(int i =1;i<=number;i++) {
			if(number % i==0)
				count++;
		}
		
		if(count == 2) {
			System.out.println(number+" is a prime");
			}else
				System.out.println(number+" Is not a prime");
		sc.close();

	}

}
