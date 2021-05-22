package week6;

import java.util.Arrays;

public class Task2_Benim {

	public static void main(String[] args) {

		int[] array = { 1, 0, 2, 0, 3, 0, 0, 4, 5, 6, 7 }; // output:{1,2,3,4,5,6,7,0,0,0,0}

		System.out.println(Arrays.toString(moveZeros(array)));

	}

    private static int[] moveZeros(int[] array) {
        
        int [] temp= new int[array.length];
        int length=array.length;
        int k=0;
        for (int i = 0; i < temp.length; i++) {
            
            if (array[i]==0) {
                length=length-1;
                temp[length]=array[i];
                
            }else {
                
                temp [k++]=array[i];
            }
            
            
        }
        
        
        return temp;
    }

}

/*
 * move all zeros to the end of array
 * 
 * array = {1,0,2,0,3,0,0,4,5,6,7}
 * 
 * output: {1,2,3,4,5,6,7,0,0,0,0}
 * 
 * DO NOT USE sort
 */
