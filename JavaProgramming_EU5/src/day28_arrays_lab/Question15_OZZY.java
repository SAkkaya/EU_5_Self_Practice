package day28_arrays_lab;

import java.util.Arrays;

public class Question15_OZZY {

	public static void main(String[] args) {
		int[] x = { 8, 6, 7, 9, 5 }; //[5, 6, 7, 9, 8]

		System.out.println(Arrays.toString(swapEnds(x)));

	}

	public static int[] swapEnds(int[] arr) {

		int temp = 0;
		temp = arr[0];
		arr[0] = arr[arr.length - 1];
		arr[arr.length - 1] = temp;

		return arr;

	}

}