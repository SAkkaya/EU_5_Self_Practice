package day25_arrays_part2;

import java.util.Scanner;

public class C7_PassArray {

	public static void main(String[] args) {

		// create an a array

		int[] numbers = new int[4];

		// pass the array to the getValues method

		getValues(numbers);

		System.out.println("Here are the numbers that you entered");

		// pass the array to showArray method

		showArray(numbers);

	}

	public static void getValues(int[] array) {  //public static void getValues(int[] cybertek) {  valubale name herhangi bir sey olabilri

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a series of " + array.length + " numbers");

		for (int i = 0; i < array.length; i++) {
			System.out.println("enter number " + (i + 1) + " : ");
			array[i] = sc.nextInt();
		}

	}
	
	public static void showArray(int[] array) {
		
		for(int value:array) {
			System.out.print(value + ", ");
		}
		
	}
	

}
