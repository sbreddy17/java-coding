package stream_employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FilterAndMapDemo {
	
	public static void main(String[] args) {
		List<Employeee> eList= new ArrayList<>();
		eList.add(new Employeee("Bhuvan",25,40000.00,"india"));
		eList.add(new Employeee("gayatri",22,24000.00,"india"));
		eList.add(new Employeee("mahi",21,22000.00,"usa"));
		eList.add(new Employeee("akhila",26,32000.00,"usa"));
		eList.add(new Employeee("Alakhya",31,45000.00,"canada"));
		
		eList.stream().filter(e->e.getSalary()>=25000.00).map(e->e.getName()+"="+e.getAge()).forEach(e->System.out.println(e));
		
		List<Employeee> name = eList.stream().filter(e->e.getName().equals("Bhuvan")).collect(Collectors.toList());
		System.out.println(name);
		
		List<String> collect = eList.stream().filter(e->e.getCountry().equals("india")).map(e->e.getName()).collect(Collectors.toList());
		System.out.println(collect);
		
		Double salaryy= eList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary()))).get().getSalary();
		System.out.println(salaryy);
		
		Map<String, List<Employeee>> collect2 = eList.stream().collect(Collectors.groupingBy(e->e.getCountry()));
		System.out.println(collect2);
		
		
		
		
	}
	

}
class Employeee{
	
	String name;
	Integer age;
	Double salary;
	String country;
	
	Employeee(String name, Integer age, Double salary,String country){
		this.name=name;
		this.age=age;
		this.salary=salary;
		this.country=country;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Employeee [name=" + name + ", age=" + age + ", salary=" + salary + ", country=" + country + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
}