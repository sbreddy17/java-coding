package demo_project;

import java.time.Year;
import java.util.Scanner;

public class LeapYearDemo {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Year");
		
		int year = sc.nextInt();
		
		if((year%400 ==0) ||(year%4==0) && (year%100!=0)) {
			System.out.println(year +" Is Leap year");
		}else
			System.out.println(year +" is not a Leap Year");
		
		sc.close();
		
	}

}
