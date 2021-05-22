package day28_arrays_lab;

import java.util.Arrays;

public class Question15 {

	public static void main(String[] args) {
	
		int[] x = {1,2,3,4}; //= > [4,2,3,1]
		int[] y = {1,2,3}; //= > [3,2,1]
		int[] z = {8,6,7,9,5}; //= > [5,6,7,9,8]
		
		System.out.println(Arrays.toString(swapEnds(x)));
		System.out.println(Arrays.toString(swapEnds(y)));
		System.out.println(Arrays.toString(swapEnds(z)));

	}
	
	
	public static int[] swapEnds(int [] arr) {
		
		int arr2[] = new int[arr.length];
		
		arr2[0]=arr[arr.length-1];
		arr2[arr2.length-1]=arr[0];
		
		for (int i = 1; i < arr.length-1; i++) {
			arr2[i]=arr[i];
		}
		
		
		return arr2;
	}
	

}



/*Write a method that accepts an array and swap the first and last element in the
array. Print the modified array
int[] x = {1,2,3,4} = > [4,2,3,1]
int[] y = {1,2,3} = > [3,2,1]
int[] z = {8,6,7,9,5} = > [5,6,7,9,8]*/


