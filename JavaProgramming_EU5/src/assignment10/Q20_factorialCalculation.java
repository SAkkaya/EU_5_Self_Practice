package assignment10;

public class Q20_factorialCalculation {

	public static void main(String[] args) {

		factorial(5);

	}

	public static void factorial(int n) {

		int fac = 1;

		for (int i = 1; i <= n; i++) {
			fac *= i;
		}
		System.out.println(n + "!: " + fac);

	}
}




/*In mathematics, the factorial of a positive integer n, denoted by n!,  is the product of all positive integers less than or equal to n. Calculate factorial and output result to the console.

Sample Output:

     input: 5
     output: 120*/