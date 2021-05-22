package assignment8_methods;

import java.util.Scanner;

public class Question7_Palindrome_Adil_Hoca {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number: ");
		int palindrome = sc.nextInt();
		sc.close();

		System.out.println(isPalindrome(palindrome));

//		        if (isPalindrome(palindrome)) {
//		            System.out.println(true);
//		        } else {
//		            System.out.println(false);
//		        }

	}

	public static boolean isPalindrome(int num) {

		int palindrome = num;
		int reverse = 0;

		while (palindrome != 0) {
			int remainder = palindrome % 10;
			reverse = reverse * 10 + remainder;
			palindrome = palindrome / 10;
		}
		if (num == reverse) {
			return true;
		} else {
			return false;
		}

	}
}