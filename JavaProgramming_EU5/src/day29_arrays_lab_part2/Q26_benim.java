package day29_arrays_lab_part2;

public class Q26_benim {

	public static void main(String[] args) {
		
		int x[] = {2,1,3,5}; //true
		int y[] = {2,1,2,5}; //false
		int z[] = {2,4,2,5}; //true
		
		System.out.println(isOddEven(x));
		System.out.println(isOddEven(y));
		System.out.println(isOddEven(z));

	}
	
	public static boolean isOddEven(int [] arr) {
		
		for (int i = 0; i < arr.length-2; i++) {
			
			if ((arr[i]%2==0 && arr[i+1]%2==0 && arr[i+2]%2==0)||(arr[i]%2!=0 && arr[i+1]%2!=0 && arr[i+1]%2!=0)) {
				return true;
			}
		
		
		}
		return false;
	
	}
}


/*Write a method that accepts an array and prints true if the array contains 3 even
or 3 odd values all next to each other.
int x[] = {2,1,3,5}; //true
int y[] = {2,1,2,5}; //false
int z[] = {2,4,2,5}; //true*/


