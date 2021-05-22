package day29_arrays_lab_part2;

public class Q25_Ben {

	public static void main(String[] args) {
	
		int[] x = {1,2,3};
		int[] y = {2,3,10};
		//Output: 2
		int[] x1 = {1,2,3};
		int[] y1 = {2,3,5};
		//Output:3
		
		System.out.println(differEllement(x,y));
		
		System.out.println(differEllement(x1,y1));
		

	}
	
	public static int differEllement(int[] arr1, int[] arr2) {
		
		int counter=0;
		
		for (int i = 0; i < arr1.length; i++) {
			
			if (arr1[i]-arr2[i]==2 || arr1[i]-arr2[i]==1 || arr2[i]-arr1[i]==2 || arr2[i]-arr1[i]==1) {
				
				counter++;
			}
			
		}
		
		
		
		return counter;
	}
	
	

}


/*Write a method that accepts two arrays of the same length. For every element in array1,
consider the corresponding element in array2 (at the same index). Return the count of
the number of times that two elements differ by 2 or less, but are not equal.

int[] x = {1,2,3};
int[] y = {2,3,10};
Output: 2
int[] x = {1,2,3};
int[] y = {2,3,5};
Output:3*/

