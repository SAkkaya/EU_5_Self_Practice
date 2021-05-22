package day29_arrays_lab_part2;

import java.util.Arrays;

public class Q23 {

	public static void main(String[] args) {
		
		System.out.println(Arrays.toString(fizzArray(4))); //→ [0, 1, 2, 3]
		System.out.println(Arrays.toString(fizzArray(1)));//→ [0]
		System.out.println(Arrays.toString(fizzArray(10))); //→[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
		
	
	}
	
	
	public static int[] fizzArray(int number) {
		
		int [] arr= new int [number];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i]=i;
		}
		return arr;
		
	}
	

}



/*Write a method that accepts a number and create and prints a new array of length
number, containing the numbers 0,1,2,...number-1.
fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) →[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]*/


