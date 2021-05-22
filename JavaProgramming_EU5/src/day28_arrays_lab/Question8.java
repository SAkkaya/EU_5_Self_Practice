package day28_arrays_lab;


public class Question8 {

	public static void main(String[] args) {
		
		int[] x = {2,5};// = > true
		int[] y = {4,3};// = > true
		int[] z = {4,5};// = > false
		
		System.out.println(contains(x));
		System.out.println(contains(y));
		System.out.println(contains(z));

	}
	
	public static boolean contains(int [] arr) {
		
		for(int value : arr) {
			
			if(value==2 || value==3) {
				
				return true;
				
//		 for (int i = 0; i < arr.length; i++) {
//				
//			if (arr[i]==2 || arr[i]==3) {
//				return true;
			
			}
			
		}
		return false;
	}

}


/*Write a method that accepts an array and prints true if it contains a 2 or a 3
int[] x = {2,5}; = > true
int[] y = {4,3}; = > true
int[] z = {4,5}; = > false*/