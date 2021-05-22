package day15_methods_part3;

public class C9_assignment3_Fibonacci_Q_Interview {

	public static void main(String[] args) {

		int count = 8;
		int pre1 = 0, pre2 = 1;
		System.out.println("Fibonacci series of " + count + " numbers");

		for (int i = 1; i < count; i++) {        // i<9       1 1 2 3 5 8 13 21    //8 sayi var yani 

			System.out.print(pre1 + " ");

			// On each iteration, we are assigning second number to the first number and
			// assigning the sum of last two numbers to the second number

			int sumOfPrevTwo = pre1 + pre2;
			pre1 = pre2;
			pre2 = sumOfPrevTwo;

		}

	}

}