package self_arrays;

import java.util.Arrays;

public class C2_ {

	public static void main(String[] args) {
		
		
		int[] myList= {1,2,3,4,5};
		
		System.out.println(myList.length);
		
		int[] myArray= {1,2,3,4,5,6};
		for (int i = 0; i < myArray.length; i++) {
			System.out.println(myArray);
			System.out.println(Arrays.toString(myArray));
			
			System.out.println(myArray[i]);
		}
		
	}

}
