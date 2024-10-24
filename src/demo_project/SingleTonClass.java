package demo_project;

public class SingleTonClass {
	
	private SingleTonClass() {
		
	}
	
	private static SingleTonClass obj = new SingleTonClass();
	
	public static SingleTonClass getSTObj() {
		return obj;
	}
	
	public static void main(String[] args) {
		
		SingleTonClass obj1 = SingleTonClass.getSTObj();
		System.out.println(obj1.hashCode());
		
		SingleTonClass obj2 = SingleTonClass.getSTObj();
		System.out.println(obj2.hashCode());
		
		SingleTonClass obj3 = SingleTonClass.getSTObj();
		System.out.println(obj3.hashCode());
	}

}
