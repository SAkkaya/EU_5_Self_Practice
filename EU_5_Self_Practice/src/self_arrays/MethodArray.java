package self_arrays;

import java.util.Arrays;
import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {

		printArray(5);
		
		System.out.println(Arrays.toString(createArray(5))); //[54, 6, 39, 86, 5]
		

	}

	public static int[] createArray(int arraySize) {

		Random rn = new Random();

		int[] myArray = new int[arraySize];

		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = rn.nextInt(100);
		}
	//	System.out.println(Arrays.toString(myArray));
		return myArray;

	}

	public static void printArray(int number) {

		int [] a= createArray(number);
		for (int value : a) {
			System.out.print(value+ " ");// 18 24 78 1 72
		}
		System.out.println();
		
		System.out.println(Arrays.toString(a));//[72, 18, 63, 50, 10]
		
		
	}
	
	
//	public static void printArray(int number) {
//
//		int [] a= createArray(number);
//		for (int value : createArray(number)) {
//			System.out.println(value);
//		}
//		
//		System.out.println(Arrays.toString(createArray(number))); 
//		
//		
//	}
}
