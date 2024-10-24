package demo_project;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateJoin {
	public static void main(String[] args) {
		
		Employee e1= new Employee("Gayatri","Hyd","Dev");
		Employee e2= new Employee("Srujana","Bngr","Devops");
		Employee e3= new Employee("Supraja","Chni","Cloud");
		Employee e4= new Employee("Mahitha","Pune","Db");
		
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		
		Predicate<Employee> p1 = e->e.dept=="Dev";
		
		for(Employee e : emps) {
			if(p1.test(e)) {
				System.out.println(e.name);
			}
		}
		
	}

}

class  Employee{
	
	String name;
	String location;
	String dept;
	
	Employee(String name,String location,String dept){
		this.name = name;
		this.location = location;
		this.dept = dept;
	}
	
	
}
