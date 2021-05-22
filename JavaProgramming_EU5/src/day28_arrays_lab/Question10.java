package day28_arrays_lab;

public class Question10 {

	public static void main(String[] args) {
		
		int[] x = {2,2}; //= > true
		int[] y = {3,3}; //= > true
		int[] a = {2,3}; //= > false
		int[] b = {12,20,42}; //= > false
		int[] c = {2,2,2};// = > false*/
		
		System.out.println(double23(x));
		System.out.println(double23(y));
		System.out.println(double23(a));
		System.out.println(double23(b));
		System.out.println(double23(c));
		

	}
	
	
	public static boolean double23(int [] arr) {
		
		int counter2 =0;
		int counter3 =0;
		
		for (int each : arr) {
			if (each==2) {
				counter2++;
			}else if (each==3) {
				counter3++;
			}
		}
		
		if (counter2==2 || counter3==2) {
			return true;
		}else {
			return false; 

		}
		
	}
}


/*Write a method that accepts an array and prints true if the array contains 2 twice or 3 twice.
		int[] x = {2,2}; = > true
		int[] y = {3,3}; = > true
		int[] a = {2,3}; = > false
		int[] b = {12,20,42}; = > false
		int[] c = {2,2,2}; = > false*/

