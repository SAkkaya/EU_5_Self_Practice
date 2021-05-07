package Barisile;

import java.util.Scanner;

public class C11_PalindromuMethodlu {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number to identify whether it is a palindrome");
		long number = scan.nextLong();
		System.out.println(isPalindrom(number));
		// System.out.println(mathPow(10,3));

	}

	private static boolean isPalindrom(long number) {

		return number == reverseNumber(number);

	}

	public static long reverseNumber(long number) {

		long digitNumber = NumberOfDigits(number);

		long reverseNumber = 0;
		while (number > 0) {
			// 1956
			reverseNumber += number % 10 * mathPow(10, digitNumber - 1);
			digitNumber--;

			number = number / 10;

		}
		return reverseNumber;

	}

	public static long mathPow(long base, long power) {
		long num = 1;
		while (power > 0) {
			num *= base;
			power--;
		}
		return num;

	}

	public static long NumberOfDigits(long number) {
		long count = 0;
		while (number > 0) {
			number = number / 10;
			count++;
		}

		return count;
	}
}