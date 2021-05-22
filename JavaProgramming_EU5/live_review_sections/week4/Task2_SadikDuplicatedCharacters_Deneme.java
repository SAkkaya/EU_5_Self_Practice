package week4;

public class Task2_SadikDuplicatedCharacters_Deneme {

	public static void main(String[] args) {
		/*
		 * str = Write a program that can remove duplciated characters from a string ex:
		 * str = "aaaabbbbbbcccccccccdddd" output: abcd
		 */
		System.out.println(duplicate("aaaabbbbbbcccccccccdddd"));
		

	}

	public static String duplicate(String str) {

		String sum = "";

		for (int i = 0; i < str.length(); i++) {
			String ch = "" + str.charAt(i);

			if (sum.contains(ch)) {
				continue;
			} else {
				sum += ch;
			}

		} return sum;

	}

}
