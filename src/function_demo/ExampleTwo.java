package function_demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExampleTwo {
	
	public static void main(String[] args) {
		
	
	
	Users u1 = new Users("Gayatri","dev","Female", 25000.00);
	Users u2 = new Users("Mahitha","dev","Female", 21000.00);
	Users u3 = new Users("Swapna","test","Female", 16000.00);
	Users u4 = new Users("Swetha","tet","Female", 12000.00);
	Users u5 = new Users("Harika","cloud","Female", 18000.00);
	Users u6 = new Users("Hasini","db","Female", 19000.00);
	Users u7 = new Users("Hasini","db","Female", 9000.00);
	Users u8 = new Users("Hasini","db","Female", 6000.00);
	Users u9 = new Users("Hasini","db","Female", 8000.00);

	
	List<Users> emps = Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8,u9);
	
	System.out.println(emps);
	
	Predicate<Users> p = e-> e.salary<=15000;
	
	for(Users u : emps) {
		if(p.test(u)) {
			u.salary = u.salary + 4000;
		}
		
	}
	System.out.println(emps);
	
	
	}
}

class Users{
	String name;
	String dept;
	String gender;
	Double salary;
	
	Users(String name, String dept, String gender, Double salary){
		
		this.name = name;
		this.dept=dept;
		this.gender=gender;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return "Users [name=" + name + ", dept=" + dept + ", gender=" + gender + ", salary=" + salary + "]";
	}

	
}


