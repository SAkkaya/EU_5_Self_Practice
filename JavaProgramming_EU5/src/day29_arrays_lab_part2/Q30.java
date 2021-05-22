package day29_arrays_lab_part2;

import java.util.Arrays;

public class Q30 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int n = 2;
		System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
		
		int[] y = {1, 2, 3, 2, 5, 2};
		int n1 = 2;
		System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]*/
		
		
	}
	
	public static int [] notAlone(int[] x, int n) {
		
		for (int i = 1; i < x.length-1; i++) {
			
			if ((x[i]==n) && (x[i-1]> n || x[i+1]> n)) {
			
				x[i]= x[i-1]> x[i+1] ? x[i-1] : x[i+1];
			}
		}
		
		return x;
	}
	
	
	

}

/*It is said that an element in array is alone if there are values before and after it, and those
values are different from it. Write a method that accepts an array and a number and
prints the given array where every instance of the given value which is alone is replaced
by whichever value to its left or right is larger.
int[] x = {1,2,3};
int n = 2;
System.out.println(Arrays.toString(notAlone(x, n))); //[1, 3, 3]
int[] y = {1, 2, 3, 2, 5, 2};
int n1 = 2;
System.out.println(Arrays.toString(notAlone(y, n1))); //[1, 3, 3, 5, 5, 2]*/
