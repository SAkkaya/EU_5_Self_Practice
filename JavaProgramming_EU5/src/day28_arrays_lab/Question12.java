package day28_arrays_lab;

public class Question12 {

	public static void main(String[] args) {
		
		int[] x = {1,2,3};
		int[] y = {1,3};
		//Output = 2	
				
		int[] x2 = {7,2,3};
		int[] y2 = {1};
		//Output = 1
		
		int[] x3 = {3,2,4};
		int[] y3 = {4,3,4};
		//Output = 0
		
		System.out.println(start1(x,y));
		System.out.println(start1(x2,y2));
		System.out.println(start1(x3,y3));


	}
	
	public static int start1(int [] arr1, int [] arr2) {
		
		int counter=0;

		if (arr1[0]==1){
			counter++;
			
		}if (arr2[0]==1){
			counter++;
		}
	
		return counter;
	}
}

/*Write a method that accepts two arrays and prints how many of the arrays have 1 as their first
element
int[] x = {1,2,3}
Int[] y = {1,3}
Output = 2
int[] x = {7,2,3}
Int[] y = {1}
Output = 1
int[] x = {3,2,4}
Int[] y = {4,3,4}
Output = 0*/



