package day29_arrays_lab_part2;

import java.util.Arrays;

public class Q28_Benim {

	public static void main(String[] args) {
		
		
		fizzArray3(5, 10); // → [5, 6, 7, 8, 9]
		fizzArray3(11, 18);//  → [11, 12, 13, 14, 15, 16, 17]
		fizzArray3(1, 3); // → [1, 2]*/
		
		System.out.println(Arrays.toString(fizzArray3(5, 10)));
		System.out.println(Arrays.toString(fizzArray3(11, 18)));
		System.out.println(Arrays.toString(fizzArray3(1, 3)));
		
	}
	
	public static int []  fizzArray3(int x, int y) {  
		
		int i =0;
		
		int [] arr = new int [y-x];
		
		for (int j = x; j<y; j++) {
			
			arr[i++]=j;
		}
		
		
		return arr;
		
	}
	
	

}



/* Write a method that accepts start and end numbers. Given start and end
numbers, return a new array containing the sequence of integers from start up to
but not including end, so start=5 and end=10 yields [5, 6, 7, 8, 9].

fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]*/

