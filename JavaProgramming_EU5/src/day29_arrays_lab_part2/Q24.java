package day29_arrays_lab_part2;

public class Q24 {

	public static void main(String[] args) {
		
		int[] x = {1, 2, 1, 3};
		int a = 2;
		   //Output: false
		int[] y = {1, 2, 1, 3};
		int b = 1;
			//Output: true
		
		System.out.println(pairAdjacent(x,a));
		System.out.println(pairAdjacent(y,b));
		System.out.println(pairAdjacent(y,3)); //false

	}
	
	
	public static boolean pairAdjacent(int [] arr, int num) {
		
		for (int i = 0; i < arr.length-2; i++) {
			if (num==arr[i] && (num==arr[i+1] || num== arr[i+2])) {
				return true;
			}
			
		}
		return false;
		
		
		
	}
	

}


/*A value is "everywhere" in an array if for every pair of adjacent elements in the array, at
least one of the pair is that value.
Write a method that accepts an array and a number, and prints true if the given number
is everywhere in the array.
int[] x = {1, 2, 1, 3};
int a = 2;
Output: false
int[] x = {1, 2, 1, 3};
int a = 1;
Output: true */
