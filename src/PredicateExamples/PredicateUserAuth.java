package PredicateExamples;

import java.util.Scanner;
import java.util.function.Predicate;

public class PredicateUserAuth {
	
	public static void main(String[] args) {
		
		Predicate<Employee> p = e -> e.userName.equals("reddy") && e.pwd.equals("java");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter USer Name");
		String userName = sc.next();
		System.out.println("Enter Password");
		String pwd = sc.next();
		
		Employee emp = new Employee(userName, pwd);
		
		if(p.test(emp)) {
			System.out.println("User Logged in");
		}else
		System.out.println("Invalid User");
		
		sc.close();
	}

}

class Employee{
	
	String userName;
	String pwd;
	
	Employee(String userName,String pwd){
		this.userName = userName;
		this.pwd = pwd;
	}
}
