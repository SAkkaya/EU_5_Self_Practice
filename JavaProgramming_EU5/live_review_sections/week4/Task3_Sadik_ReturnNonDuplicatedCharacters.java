package week4;

public class Task3_Sadik_ReturnNonDuplicatedCharacters {

	public static void main(String[] args) {
		/*
		 * Write a program that can return the first non-duplicated character from the
		 * string ex: str = "aaabcccdeeef" output: b
		 */
		System.out.println(firstNonDuplicated("aaabcccdeeef"));

	}

	public static String firstNonDuplicated(String str) {
		String result = "";

		for (int i = 0; i < str.length(); i++) {

			String letter = "" + str.charAt(i);

			for (int j = 0; j < str.length(); j++) {

				if (result.contains(letter)) {

					continue;

				}
				result += letter;

			}
			

		}return result;

	}
}
