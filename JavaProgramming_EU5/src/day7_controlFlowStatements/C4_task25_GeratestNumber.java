package day7_controlFlowStatements;

public class C4_task25_GeratestNumber {

	public static void main(String[] args) {
		/*
		 * Write Java program that will accept three numbers and return the greatest
		 * number. • Input: Enter first number: 4 Enter second number: 8 Enter third
		 * number: 1 • Output: The greatest number is: 8
		 */

		int num1 = 4;
		int num2 = 8;
		int num3 = 18;

		if (num1 > num2 && num1 > num3) {
			System.out.println("The greatest number is: " + num1);
		}
		if (num2 > num1 && num2 > num3) {
			System.out.println("The greatest number is: " + num2);
		}
		if (num3 > num1 && num3 > num2) {
			System.out.println("The greatest number is: " + num3);

		}

	}

}
