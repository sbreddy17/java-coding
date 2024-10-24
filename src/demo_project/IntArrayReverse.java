package demo_project;

import java.util.Arrays;

public class IntArrayReverse {
	
	public static void main(String[] args) {
		int[] array = {1,2,3,4,5,6};
		
		for(int i=array.length-1;i>=0;i--) {
			System.out.print(array[i]+" ");
			
		}
		System.out.println();
		
		int temp=0;
		for(int i=0;i<array.length/2;i++) {
			temp =array[i];
			array[i]=array[array.length-1-i];
			array[array.length-1-i] = temp;
			}
		for(int n : array) {
			System.out.print(n+" ");
		}
		
		System.out.println();
		System.out.println(Arrays.toString(array));
	}

}
