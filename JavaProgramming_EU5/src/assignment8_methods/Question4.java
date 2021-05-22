package assignment8_methods;

public class Question4 {

	public static void main(String[] args) {
		printHollowRect();

	}
	
	public static void printHollowRect() {                 

		for (int i = 1; i <= 5; i++) {                     
			System.out.println();						
															
			for (int j = 1; j <= 5; j++) { 
				if (i==1||i==5) {
					System.out.print("*");
				}else if(j==1||j==5){
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
										
			}														

		}

	}

}

/*
 * Create a method printHollowRect that prints a 5 on 5 hollow rectangle: hint:
 * you will need to use two nested for loops for that, and an if that checks if
 * its the last or first iteration of the loop (so you will know whet to print
 * "*" or " ")
 */