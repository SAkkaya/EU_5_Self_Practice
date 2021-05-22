package day29_arrays_lab_part2;

public class Question18_Ozzy {

	public static void main(String[] args) {
		int[] x = {1,2,2,1};// = > 6
		int[] y = {1,1};// = > 2
		int[] a = {1,2,2,1,13};// = > 6
		int[] b = {1,2,2,1,13,3,4,100};// = > 6    //  13 den sonraki butun rakamlari almiyor
		
		System.out.println(doNotCount13(x));
		System.out.println(doNotCount13(y));
		System.out.println(doNotCount13(a));
		System.out.println(doNotCount13(b));
	
	
	}
	
	public static int doNotCount13(int [] x) {
		
		int sum = 0;
		
		for(int i=0;i<x.length;i++) {
			
			if(x[i] != 13) {
				sum=sum+x[i];
			}else {
				break;
				
			}
		}
		
		return sum;
	}

}


/*Write a function that accepts an array and prints the sum of the numbers in the
array. Except the number 13 is very unlucky, so it does not count and numbers that
come immediately after a 13 also do not count
int[] x = {1,2,2,1} = > 6
int[] y = {1,1} = > 2
int[] a = {1,2,2,1,13} = > 6
int[] b = {1,2,2,1,13,3} = > 6*/

