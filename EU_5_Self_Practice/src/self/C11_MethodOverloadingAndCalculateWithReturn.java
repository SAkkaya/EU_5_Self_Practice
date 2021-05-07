package self;

public class C11_MethodOverloadingAndCalculateWithReturn {

	public static void main(String[] args) {

		int result1 = calculate('+', 200, 100); // 300
		System.out.println(result1);

		System.out.println("calculate('+', 200, 100) result is " + calculate('+', 200, 100)); // calculate('+', 200,
																								// 100) result is 300
		System.out.println("calculate('-', 200, 100) result is " + calculate('-', 200, 100)); // 100
		System.out.println("calculate('*', 200, 100) result is " + calculate('*', 200, 100)); // 2000
		System.out.println("calculate('/', 200, 100) result is " + calculate('/', 200, 100)); // 2
	}

	private static int calculate(char operator, int num1, int num2) {

		int result;

		switch (operator) {
		case '+':
			result = add(num1, num2);
			break;
		case '-':
			result = substract(num1, num2);
			break;
		case '*':
			result = multiply(num1, num2);
			break;
		case '/':
			result = divide(num1, num2);
			break;
		default:
			result = 0;
			break;
		}

		return result;

	}

	private static int divide(int num1, int num2) {

		return num1 / num2;
	}

	private static int multiply(int num1, int num2) {

		return num1 * num2;
	}

	private static int substract(int num1, int num2) {

		return num1 - num2;
	}

	public static int add(int num1, int num2) {

		return num1 + num2;
	}

}
