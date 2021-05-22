package day29_arrays_lab_part2;

import java.util.Arrays;

public class Q29_Baris {

	    public static void main(String[] args) {

	        int[] x = { 2, 10, 3, 4, 20, 5 }; //2,10,2,10
	        int[] y = { 10, 1, 20, 2, 30, 2 };
	        int[] z= {2,4,10,20,5,3,2};

	        int[] result = tenRun(z);
	        System.out.println(Arrays.toString(result));
	    }

	    public static int[] tenRun(int[] x) {

	        for (int i = 0; i < x.length - 1; i++) {

	            if (x[i] % 10 == 0 && x[i + 1] % 10 != 0) {

	                x[i + 1] = x[i];
	            }

	        }

	        return x;
	    }

	}