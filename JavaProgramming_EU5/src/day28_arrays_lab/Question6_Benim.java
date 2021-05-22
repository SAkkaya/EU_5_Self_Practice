package day28_arrays_lab;

import java.util.Arrays;

public class Question6_Benim {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};// = > [3,3,3]
		int[] y = {11,5,9};// = > [11,11,11]
		int[] a = {110,5,98,0,1200,11,-4};// = > [1200,1200,1200,1200,1200,1200,1200]*/
		
		System.out.println(Arrays.toString(greatest(x)));
		System.out.println(Arrays.toString(greatest(y)));
		System.out.println(Arrays.toString(greatest(a)));
		

	}
	
	public static int[] greatest(int [] arr) {
		int enBuyuk=0;
		
		int arr2[]=new int[arr.length];
		
		for (int i=0; i < arr.length; i++ ){
			
			if (arr[i]>enBuyuk) {
				enBuyuk=arr[i];
			}
		for (int j = 0; j < arr2.length; j++) {
			arr2[j] = enBuyuk;
		}
		
		}
		return arr2;
	}

}


/*Write a method that accepts an array and figure out which is greatest element in the
array, a and set all the other elements to be that value. Print the changed array.
int[] x = {1,2,3}; = > [3,3,3]
int[] y = {11,5,9}; = > [11,11,11]
int[] a = {110,5,98,0,1200,11,-4}; = > [1200,1200,1200,1200,1200,1200,1200]*/