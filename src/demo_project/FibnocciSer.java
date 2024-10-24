package demo_project;

public class FibnocciSer {
	
	public static void main(String[] args) {
		int a =0; int b=1;
		
		for(int i=1;i<=15;i++) {
			System.out.print(a+" ");
			int sum = a+b;
			a=b;
			b=sum;	
		}
	}

}
