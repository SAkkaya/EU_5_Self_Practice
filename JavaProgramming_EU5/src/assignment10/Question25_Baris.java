package assignment10;

public class Question25_Baris {

	public static void main(String[] args) {
		String s1 = "12345";
		String s2 = "abcde";

		mergeStrings(s1, s2);
		// "1a2b3c4d5e"

		mergeStrings("wooden", "spoon"); // "wsopoodoenn"

		mergeStrings("java", "selenium");

	}

	public static void mergeStrings(String s1, String s2) {
		int s1len = s1.length();
		int s2len = s2.length();
		String res = "";
		if (s1len == s2len) {
			for (int i = 0; i < s2len; i++) {
				res += "" + s1.charAt(i) + s2.charAt(i);

			}
		} else if (s1len > s2len) {
			for (int i = 0; i < s2len; i++) {
				res += "" + s1.charAt(i) + s2.charAt(i);

			}
			res += s1.substring(s2len);
		} else {
			for (int i = 0; i < s1len; i++) {
				res += "" + s1.charAt(i) + s2.charAt(i);

			}
			res += s2.substring(s1len);
		}

		System.out.println(res);
	}

}