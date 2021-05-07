package self_arrays;

import java.util.Arrays;

public class ForEachLoop {

	public static void main(String[] args) {

		int[] numbers = { 3, 6, 9 };
		for (int val : numbers) {
			System.out.println(val);

			int[] myIntArray = new int[5];
			int[] anotherArray = myIntArray;

			System.out.println("myIntArray= " + Arrays.toString(myIntArray));
			System.out.println("anotherArray= " + Arrays.toString(anotherArray));
			
			anotherArray[0]=1;
			
			System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
			System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

		}

	}
}
