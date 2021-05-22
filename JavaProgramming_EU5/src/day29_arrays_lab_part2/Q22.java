package day29_arrays_lab_part2;

public class Q22 {

	public static void main(String[] args) {
		
		int[] x = {1,4,1}; // = > true
		int[] x1 = {1,4,1,4};// = > false
		int[] x2 = {1,1};// = > true
		
		System.out.println(greater1from4(x));
		System.out.println(greater1from4(x1));
		System.out.println(greater1from4(x2));
		

	}
	
	public static boolean greater1from4(int[] arr) {
		
		int countOne=0;
		int countFour=0;
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i]==1) {
				countOne++;
			} else if (arr[i]==4){
				countFour++;
			}
//			else {   gerek yok
//				continue;
//			}
		}
		
		if (countOne>countFour)
			return true;
		else {
			return false;
		}
		
	}
	

}


/*Write a method that accepts an array and prints true if the number 1's is greater than the number 4's
int[] x = {1,4,1} = > true
int[] x = {1,4,1,4} = > false
int[] x = {1,1} = > true*/

