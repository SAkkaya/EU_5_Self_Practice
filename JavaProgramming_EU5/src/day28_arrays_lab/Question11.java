package day28_arrays_lab;

import java.util.Arrays;

public class Question11 {

	public static void main(String[] args) {
		
		
		int[] x = {1,2,3}; // = > [1,2,0]
		int[] a = {2,3,5}; // = > [2,0,5]
		int[] b = {1,2,1} ;//= > [1,2,1]
		int[] c = {11,2,13,3,2,3}; // = > [11,2,13,3,2,0]
		
		System.out.println(Arrays.toString(fix23(x)));
		System.out.println(Arrays.toString(fix23(a)));
		System.out.println(Arrays.toString(fix23(b)));
		System.out.println(Arrays.toString(fix23(c)));
		
		
	}

	public static int[] fix23(int [] arr) {
		
		for (int i = 0; i < arr.length-1; i++) {
			
			if (arr[i]==2 && arr[i+1]==3) {
				arr[i+1]=0;
			}
		}
		
		
		return arr;
	}
	
	
}


/*Write a method that accepts an array, and if there is a 2 in the array immediately
followed by a 3, set the 3 element to 0. Print the changed Array
int[] x = {1,2,3} = > [1,2,0]
int[] x = {2,3,5} = > [2,0,5]
int[] x = {1,2,1} = > [1,2,1]
int[] x = {11,2,13,3,2} = > [11,2,13,3,2]*/


