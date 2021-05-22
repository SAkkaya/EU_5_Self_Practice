package day23_stringManipulationLab_randomClasss;

public class Question_12_Benim {

	public static void main(String[] args) {

		System.out.println(catDog("1catCat1cadoDogcataaDogdog"));

	}

	public static boolean catDog(String str) {

		int catCounter = 0;
		int dogCounter = 0;

		for (int i = 0; i < str.length()-2; i++) {  

			if ((str.substring(i, i + 3).equalsIgnoreCase("cat"))) {
				catCounter++;
			}

			if ((str.substring(i, i + 3).equalsIgnoreCase("dog"))) {   //	if ((str.substring(i, i + 3).contains("dog"))) {
				dogCounter++;
			}

		}

		if (catCounter == dogCounter) {
			return true;
		} else {
			return false;
		}
	}

}

/*
 * Return true if the string "cat" and "dog" appear the same number of times in
 * the given string. catDog("catdog") → true catDog("catcat") → false
 * catDog("1cat1cadodog") → true
 */