package day11_controlFlowStatements_Part5;

public class C11_Task53_WhileLoopEvenNumbers {

	public static void main(String[] args) {
		// Write a program using while loop, that calculates the sum of the even numbers
		// between 0 and 100

		int i = 0;

		int sumEven = 0;

		while (i < 100) {

			if (i % 2 == 0) {

				sumEven = sumEven + i;

			}

			i++;

		}

		System.out.println(sumEven);
	}
}