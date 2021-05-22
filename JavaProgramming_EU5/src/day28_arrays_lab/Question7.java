package day28_arrays_lab;

import java.util.Arrays;

public class Question7 {

	public static void main(String[] args) {
		int[] x = {1,2,3};
		int[] y = {}; // = > [1,3]
		System.out.println(Arrays.toString(makeEnds(x, y)));
		
		int[] a = {7,4,6,2};
		int[] b = {}; // = > [7,2]
		System.out.println(Arrays.toString(makeEnds(a, b)));
		
		
	}
	
	public static int[] makeEnds(int [] arr, int[] arr2 ) {
		
		arr2 = new int [2];
	
		
		arr2[0]=arr[0];
		arr2[1]=arr[arr.length-1];
		
		
		return arr2;
	}
	
	

}

/*Write a method that accepts 2 arrays and prints the second array containing the first
and last elements from the first array.
int[] x = {1,2,3};
int[] y = {}; = > [1,3]
int[] a = {7,4,6,2};
int[] b = {}; = > [7,2]*/