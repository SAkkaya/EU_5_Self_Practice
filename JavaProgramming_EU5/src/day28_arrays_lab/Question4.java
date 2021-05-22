package day28_arrays_lab;

public class Question4 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};// = > 6
		int[] y = {5,11,2};// = > 18
		int[] z = {7,0,0}; //= > 7
		int[] k = {3,-2,10,4};// = > 15
		
		int a =sum(x);
		System.out.println(a);
		
		
		System.out.println(sum(y));
		System.out.println(sum(z));
		System.out.println(sum(k));

	}
	
	public static int sum(int [] arr) {
		
		int sum=0;
		
		for(int each: arr) {
			sum+=each;
		}
		
//		for (int i = 0; i < arr.length; i++) {
//			sum=sum+arr[i];
//		}
	
		return sum;
	}
	

}



/*Write a method that accepts an array and prints the sum of all elements in the array
int[] x = {1,2,3}; = > 6
int[] y = {5,11,2}; = > 18
int[] z = {7,0,0}; = > 7
int[] a = {3,-2,10,4}; = > 15*/



