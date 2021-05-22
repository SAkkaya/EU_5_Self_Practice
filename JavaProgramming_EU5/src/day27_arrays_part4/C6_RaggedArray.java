package day27_arrays_part4;

public class C6_RaggedArray {

	public static void main(String[] args) {
		
		int[][] array = new int [4][];
		
		System.out.println(array[0]); //null
		
		array[0] = new int[3];
		array[1] = new int[4];
		array[2] = new int[5];
		array[3] = new int[2];
	
		
		int[][] array2= {{0,0,0}, {0,0,0,0},{0,0,0,0,0}, {0,0}};
		
		//int[][] array2= {{}};
		//System.out.println(array2[0]); //[I@cac736f
	}

}
