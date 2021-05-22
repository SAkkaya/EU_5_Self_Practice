package assignment8_methods;

import java.util.Scanner;

public class Question7_Baris {

	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("enter a four digit number");
		int num = scan.nextInt();
		boolean result = isPalindrom(num);
		System.out.println(result);

	}

	public static boolean isPalindrom(int num) {

		if (num >= 1000 && num <= 9999) {
			int thousands = num / 1000;
			int houndredsOf = num % 1000 / 100;
			int tens = num % 1000 % 100 / 10;
			int theones = num % 1000 % 100 % 10;

			if (thousands == theones && tens == houndredsOf) {
				return true;
			} else {
				return false;
			}
		} else {

			System.out.println("Invalid number, enter a four digit number");
			num = scan.nextInt();

			return isPalindrom(num);

		}

	}

}