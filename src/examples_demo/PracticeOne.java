package examples_demo;

public class PracticeOne {

	public static void main(String[] args) {
		
		int numbers[] = { 10,14, 23, 15, 16, 54, 76, 86 };
		
		  int temp = 0; for(int i=0;i<numbers.length/2;i++) { temp = numbers[i];
		  numbers[i] = numbers[numbers.length-1-i]; numbers[numbers.length-1-i]= temp;
		  
		  }
		 
		for (int x : numbers) {
			if (x <=18) 
				x = x + 10;
			System.out.println(x + " ");

		}

	}

}
