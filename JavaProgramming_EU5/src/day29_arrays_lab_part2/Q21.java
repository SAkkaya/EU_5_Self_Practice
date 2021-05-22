package day29_arrays_lab_part2;

public class Q21 {

	public static void main(String[] args) {
		
		int[] x = {2, 3, 2, 2, 4, 2}; // = > true
		int[] y = {2, 3, 2, 2, 4, 2, 2}; //= > false
		int[] z = {1, 2, 3, 4}; // = > false 
		int[] a = {2, 3, 2, 2, 4, 2, 2}; // = > false
		int[] b = {2, 3, 4, 2, 4, 2, 2}; //= > true
		int[] c = {1, 2, 3, 4,2}; // = > false 
		
		
		System.out.println(sumAll2(x));
		System.out.println(sumAll2(y));
		System.out.println(sumAll2(z));
		System.out.println(sumAll2(a));
		System.out.println(sumAll2(b));
		System.out.println(sumAll2(c));
		

	}
	
	public static boolean sumAll2(int [] arr) {
		
		int sum =0;
		
		for (int each : arr) {
			
			if (each==2) {
				sum+=each;
			}
				
		}
		
//		for(int i=0;i<arr.length;i++) {
//			
//			if(arr[i] ==2) {
//				
//				sum = sum + arr[i];
//			}
//		}
		
		if (sum==8) {
			return true;
			}
		
		return false;
	}
	

}


/*Write a method that accepts an array and prints true if the sum of all 2's in the
array is exactly 8
int[] x = {2, 3, 2, 2, 4, 2} = > true
int[] x = {2, 3, 2, 2, 4, 2, 2} = > false
int[] x = {1, 2, 3, 4} = > false */

