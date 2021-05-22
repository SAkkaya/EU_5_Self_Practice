package day14_methods_part2;

public class C7_ValueReturn {

	public static void main(String[] args) {

		int x = sum(2, 3); // --> 1 yontem
	
		System.out.println(x);//5  --1. yontem 
		
		System.out.println(sum(2, 3)); //5    --> yontem 2

	}

	public static int sum(int num1, int num2) {

		int result; // local variable
		result = num1 + num2;

		return result;

	}

}