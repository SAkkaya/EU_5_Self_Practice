package assignment8_methods;

public class Question7 {

	public static void main(String[] args) {
		
		System.out.println(isPalindrome(1004));
	

	}

	public static boolean isPalindrome(int num) {

		int binler = num / 1000;
		int yuzler = (num / 10) % 10;
		int onlar = (num / 100) % 10;
		int birler = num % 1000;

		int reverseNum = birler * 1000 + onlar * 100 + 10 * yuzler + binler;

		if (reverseNum == num) {
			return true;
		} else {
			return false;
		}

	}

}

/*
 * Complete a method isPalindrome() that will check if the number is a
 * palindrome. Print your result as a boolean (true or false). Do not convert
 * int into a string! Example: input: 1001 output: true
 * 
 * Example: input: 1234 output: false
 */