package day29_arrays_lab_part2;

public class Q27_Benim {

	public static void main(String[] args) {

		int[] x = {1,4,5,6,2}; //true
		int[] y = {1,2,3}; //true
		int[] z = {1,2,4,5,8,9};  //false

		System.out.println(adjacent3(x));
		System.out.println(adjacent3(y));
		System.out.println(adjacent3(z));

   }
	public static boolean adjacent3(int[]arr) {
 
		for (int i = 0; i < arr.length-2; i++) {
			if (arr[i]+1==arr[i+1] && arr[i+1]+1==arr[i+2]) {
				return true;
			}
		}
		
		return false;
	}
}

/*Write a method that accepts an array and prints true if the array contains, somewhere,
three increasing adjacent numbers like 4,5,6,... or 23,24,25.
int[] x = {1,4,5,6,2}; //true
int[] y = {1,2,3}; //true
int[] z = {1,2,4,5,8,9}; //false*/