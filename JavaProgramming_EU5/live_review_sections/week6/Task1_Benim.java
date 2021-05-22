package week6;

import java.util.Arrays;

public class Task1_Benim {

	public static void main(String[] args) {
		
		int []arr1 = {1,2,3};
		int [] arr2 = {4,5,6,7};
		
		System.out.println(Arrays.toString(merge(arr1, arr2)));
		
		
	}
	
	
//	public static int[] merge(int []arr1, int [] arr2) {
//		
//		
//		int [] arr3 = new int[arr1.length+arr2.length];    
//
//		
//		for (int i = 0; i < arr1.length; i++) {
//			arr3[i]=arr1[i];
//		}
//		
//		for (int i = arr1.length,j=0; i < arr3.length; i++, j++) {
//			arr3[i]=arr2[j];
//		}
//		return arr3;
//	}
	
	
public static int[] merge(int []arr1, int [] arr2) {
		
		
		int [] arr3 = new int[arr1.length+arr2.length];    

		int j=0;
		
		for (int i = 0; i < arr3.length; i++) {
			
			if(i<arr1.length) {   // 3
				arr3[i]=arr1[i];
			}else {
				arr3[i] = arr2[j++];
			//	j++;
			}
			
			
		}
		return arr3;
	}
	
	

}


/*  1. write a program that can merge two arrays of integer and returns the third array

arr1 ={1,2,3}
arr2 = {4,5,6,7}

output:
    arr3 = {1,2,3,4,5,6,7}
*/