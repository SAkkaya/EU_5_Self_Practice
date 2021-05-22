package day28_arrays_lab;

import java.util.Arrays;

public class Question9 {

	public static void main(String[] args) {
		int[] x = {4,5,6}; //= > [0,0,0,0,0,6]
		
		System.out.println(Arrays.toString(makeLast(x)));
	}
	
	
	public static int[] makeLast(int [] arr) {
		
		int arr2 [] = new int[arr.length*2]; 
		
		arr2[arr2.length-1]=arr[arr.length-1];
		
	
		return arr2;
		
	}

}


/*Write a method that accepts an array and prints a new array with double the length
where its last element is the same as the original array,
int[] x = {4,5,6}; = > [0,0,0,0,0,6]*/