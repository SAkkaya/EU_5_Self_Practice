package day19_stringManupulation_part1;

public class C6_TAsk78_CountNummerOfOccurance {

	public static void main(String[] args) {
		// Write a program to count the number of occurrences for specific char
		// String word = "abcabqcabc”
		// Number of a in this string is: 3

		String word = "abcabqcab";
		char myChar = 'a';

		int counter = 0;

		for (int i = 0; i < word.length(); i++) {

			if (word.charAt(i) == myChar) {
				counter++;
			}

		}

		System.out.println("Number of " + myChar + " in this string is: " + counter);

	}

}
