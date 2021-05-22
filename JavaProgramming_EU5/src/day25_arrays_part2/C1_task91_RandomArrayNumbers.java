package day25_arrays_part2;

import java.util.Random;

public class C1_task91_RandomArrayNumbers {

	public static void main(String[] args) {
		
		Random rd=new Random();
		
		int[] myArrays= new int[10];
		
		myArrays[0]=rd.nextInt(100);
		myArrays[1]=rd.nextInt(100);
		myArrays[2]=rd.nextInt(100);
		myArrays[3]=rd.nextInt(100);
		myArrays[4]=rd.nextInt(100);
		myArrays[5]=rd.nextInt(100);
		myArrays[6]=rd.nextInt(100);
		myArrays[7]=rd.nextInt(100);
		myArrays[8]=rd.nextInt(100);
		myArrays[9]=rd.nextInt(100);
		
		for (int i = 0; i < myArrays.length; i++) {
			System.out.println(myArrays[i]);
		}
		
	
	}

}


/*ØCreate an array with 10 elements
ØInitialize each array element with random values between 0 and 100 but less than 100
ØPrint each array element*/