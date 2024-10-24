package stream_employee;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamDemo {
	
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(12,13,54,54,21,54,55);
		list.stream().filter(e->e>18).forEach(e->System.out.println(e));
		
		List<String> names = Arrays.asList("akhila","mahi","gayatri","bhuvan","harshita","alakhya","sophie");
		names.stream().filter(e->e.startsWith("a")).forEach(e->System.out.println(e));
		
		List<User> uList = new ArrayList<>();
		uList.add(new User("Bhuvan",25));
		uList.add(new User("gayatri",15));
		uList.add(new User("mahi",20));
		uList.add(new User("akhila",22));
		uList.add(new User("harshita",28));
		uList.add(new User("alakhya",35));
		uList.add(new User("sophie",17));
		
		uList.stream().filter(u->u.getAge()<=18).forEach(u->System.out.println(u));
		
	}
}









class User{
	String name;
	int age;
	
	User(String name,int age){
		this.name=name;
		this.age =age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + "]";
	}
	
	
}
