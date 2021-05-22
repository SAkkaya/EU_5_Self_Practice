package day29_arrays_lab_part2;

public class Q19 {

	public static void main(String[] args) {
	
		int[] x = {1,2,2};// = > 5
		int[] y = {1, 2, 2, 6, 99, 99, 7};// = > 5
		int[] a = {1,1,6,7,2};// = > 4
		int[] b = {1,1,6,2};// = > 2
		int[] c = {1,2,2,6,99,99,7,3,4};// = > 12
		
		System.out.println(extending6To7(x));
		System.out.println(extending6To7(y));
		System.out.println(extending6To7(a));
		System.out.println(extending6To7(b));
		System.out.println(extending6To7(c));	
	}
	public static int extending6To7(int [] x) {
		
		int sum = 0;
		boolean boolCheckSix = false;
		
		for(int i=0;i<x.length;i++) {
			
			if(boolCheckSix) {
				
				if(x[i] == 7 ) {
					
					boolCheckSix = false;
				}

			}else if(x[i] == 6) {
				
				boolCheckSix = true;
				
			}else {
				
				sum = sum + x[i];
					
			}
		}
		
		return sum;

		}

	}




/*Write a method that accepts an array and prints the total of the numbers in the
array, except ignore sections of numbers starting with a 6 and extending to the
next 7 (every 6 will be followed by at least one 7).
int[] x = {1,2,2} = > 5
int[] y = {1, 2, 2, 6, 99, 99, 7} = > 5
int[] a = {1,1,6,7,2} = > 4
int[] b = {1,1,6,2} = > 2
int[] c = {1,2,2,6,99,99,7,3,4} = > 12*/

