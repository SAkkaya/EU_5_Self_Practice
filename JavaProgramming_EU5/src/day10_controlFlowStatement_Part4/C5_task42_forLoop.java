package day10_controlFlowStatement_Part4;

public class C5_task42_forLoop {

	public static void main(String[] args) {
		// Write a program that displays sum of even and odd numbers between 1 and 100
		// excluding 100

		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 1; i < 100; i++) {

			if (i % 2 == 0) {
				sumEven = sumEven + i; // 0+2=2
			} else {
				sumOdd = sumOdd + i; // 0+1=1 +3 =4
			}

		}
		System.out.println("Sum of even nummer  = " + sumEven);
		System.out.println("Sum of odd nummer  = " + sumOdd);
	}

}
