package assignment10;

public class Question31 {

	public static void main(String[] args) {

		boolean result=isPalindrome("I am not palindrome");
		System.out.println(result);    //false
		
		boolean result2=isPalindrome("Nurses Run");
		System.out.println(result2); //true
	}

	public static boolean isPalindrome(String str) {

		str = str.replace(" ", ""); // Iamnotpalindrome

		return str.equalsIgnoreCase(reverseStr(str)); // true

	}

	public static String reverseStr(String str) {

		String dummyStr = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			dummyStr += "" + str.charAt(i);
		}
		return dummyStr;
	}

}

/*Question-31

Palindrome is a word, phrase, or sequence that reads the same backward as forward, e.g., madam or nurses run.

So method isPalindrome checks that and returns true if check is palindrome and false if it is not.

- make your conditions case insensitive. ex: Civic and civic are both palindromes
- make your conditions space insensitive. Race car is a palindrome even though there is space in between.

Sample Output:

     isPalindrome("Noon") ==> true

     isPalindrome("I am not palindrome") ==> false

     isPalindrome("wooden") ==> false

     isPalindrome("Nurses Run") ==> true*/
