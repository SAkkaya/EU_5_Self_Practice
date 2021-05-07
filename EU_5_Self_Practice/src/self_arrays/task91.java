package self_arrays;

import java.util.Arrays;
import java.util.Random;

public class task91 {

	public static void main(String[] args) {
		
		int[] arrays = new int[10];
		
		Random rd= new Random();
		
		for (int i = 0; i < arrays.length; i++) {
				arrays[i]=rd.nextInt(100);
		}
		
		System.out.print("arrays : " + Arrays.toString(arrays));

	}

}
