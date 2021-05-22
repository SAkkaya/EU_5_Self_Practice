package day29_arrays_lab_part2;

public class Q20_Benim {

	public static void main(String[] args) {

		int[] x = {1,2,2};// = > true
		int[] y = {1, 2, 1,2};// = > false
		int[] a = {2,1,2};// = > false
		int[] b = {2,2,1,2};// = > true*/

		System.out.println(nextTo2(x));
		System.out.println(nextTo2(y));
		System.out.println(nextTo2(a));
		System.out.println(nextTo2(b));
		
	}
	
	public static boolean nextTo2(int [] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			if (arr[i]==2 && arr[i+1]==2) {
				return true;
			}
		}
		return false;
		
		
	}
	
	
	

}



/*Write a method that accepts an array and prints true if the array contains a 2
next to a 2 somewhere.


int[] x = {1,2,2};// = > true
int[] y = {1, 2, 1,2};// = > false
int[] a = {2,1,2};// = > false
int[] b = {2,2,1,2};// = > true*/


