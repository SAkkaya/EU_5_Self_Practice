package assignment8_methods;

public class Question6 {

	public static void main(String[] args) {

		next3(1);

	}

	public static void next3(int num) {
		System.out.println("next 3 are:");
		for (int j = num + 1; j <= num + 3; j++) {

			System.out.print(+j + " ");
		}

	}
//2. Yontem
//	public static void next3(int num) {
//	    System.out.println("next 3 are:");
//	        for (int i = 1; i <= 3; i++) {
//	            num++;
//	            System.out.print(num + " ");
//	        
//	        }
	

}

/*
 * Create a method called next3 . This method gets an int argument and prints
 * the next 3 numbers after that number. Call the method from main method and
 * pass num to it.
 * 
 * enter number 1 next 3 are: 2 3 4
 * 
 * (put a space between numbers)
 */