package day8_controlFlowStatements_Part2;

public class C6_task32_LargestNumber {

	public static void main(String[] args) {
		// Declare 3 numbers
		// Program should display which one is largest

		int num1 = 13;
		int num2 = 40;
		int num3 = 5;

		if ((num1 > num2) && (num1 > num3)) {
			System.out.println(num1 + " is largest");
		} else if ((num2 > num1) && (num2 > num3)) {
			System.out.println(num2 + " is largest");
		} else if((num3 > num1)&&(num3 > num2)){
			System.out.println(num3 + " is largest");
		}else {
			System.out.println("Numbers are equal");
		}

	}
}
