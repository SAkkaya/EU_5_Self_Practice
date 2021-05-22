package day28_arrays_lab;

import java.util.Arrays;

public class Question14 {

	public static void main(String[] args) {
		int[] x = {1,2};int[] y = {3,4}; //= > [1,2,3,4]
		int[] x1 = {4,4}; int[] y1 = {2,2}; //= > [4,4,2,2]
		int[] x2 = {9,2}; int[] y2 = {3,4};// = > [9,2,3,4]

		System.out.println(Arrays.toString(newArray(x, y)));
		System.out.println(Arrays.toString(newArray(x1, y1)));
		System.out.println(Arrays.toString(newArray(x2, y2)));
		
	}
	
	
	public static int[] newArray(int [] arr1, int [] arr2) {
		
		int [] arr3 = new int [arr1.length+arr2.length];
		
		for (int i = 0; i < arr1.length; i++) {
			
			arr3[i]=arr1[i];	
			}
		for (int i = 0; i < arr2.length; i++) {
			
			arr3[i+arr1.length] = arr2[i];
			
		}
		
		return arr3;
	}

}


/*Write a method that accepts 2 arrays and prints a new array containing all their
elements
int[] x = {1,2} int[] y = {3,4} = > [1,2,3,4]
int[] x = {4,4} int[] y = {2,2} = > [4,4,2,2]
int[] x = {9,2} int[] y = {3,4} = > [9,2,3,4]*/