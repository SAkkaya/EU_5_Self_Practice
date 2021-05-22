package assignment8_methods;

public class Question_8 {

	public static void main(String[] args) {

		int output=fib(9);
		System.out.println(output);



	}

	public static int fib(int num) {

		int dummy1 = 0;
		int dummy2 = 0;

		int sum=0;
		for (int i = 0; i < num; i++) {
			sum = dummy1 + dummy2;
			if (sum == 0) {
				dummy1++;
				dummy2++;
			}
			dummy1 = dummy2;
			dummy2 = sum;

			//if (i + 1 == num) method void olursa burayi kullan
			//}

		}
		return sum;

	}

}

/*
 * Complete a method fib() that will compute Fibonacci numbers In fibonacci
 * series, next number is the sum of previous two numbers for example 0, 1, 1,
 * 2, 3, 5, 8, 13, 21, 34, 55, 89, 144,……... The first two numbers of fibonacci
 * series are 0 and 1. Given a number num, print n-th Fibonacci Number.
 * 
 * Input : 2 Output : 1
 * 
 * Input : 9 Output : 21
 */