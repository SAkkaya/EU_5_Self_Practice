package day25_arrays_part2;

import java.util.Arrays;

public class C2_task92_TableArray {

	public static void main(String[] args) {

		int[] numbers = new int[10]; // int[] numbers= {1,2,3,4,5,6,7,8,9,10};

		for (int i = 0; i < numbers.length; i++) { // assignment yaptik
			numbers[i] = i + 1;
		}

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(numbers[i] * 19);
		}

//		for(int i=0; i<numbers.length;i++) {    tek loop da olur
//			numbers[i]=i+1;   
//			System.out.println(numbers[i]*19);      
//		}    
		
		System.out.println(numbers); //[I@cac736f  bu arrays i vermez referans inin verir.
		System.out.println(Arrays.toString(numbers));  //[1, 2, 3, 4, 5, 6, 7, 8, 9, 10] --> Arrays.toString(args)--> printing Arrays format

	}

}





/*
 * ØWrite a Java program to store numbers 1 to 10 in an array using data
 * instantiation. Then write a for loop to multiply each member of above array
 * by 19, this way you will get table of 19 stored in the above array. Finally
 * write another for loop to print all the array elements. ØYou should get the
 * following output: 19 38 57 76 95 114 133 152 171 190
 */