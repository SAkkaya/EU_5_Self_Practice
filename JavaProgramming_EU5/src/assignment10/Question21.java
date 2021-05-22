package assignment10;

public class Question21 {

	public static void main(String[] args) {
		String str = "abXYabc";
		int a = 1;
		findFirstString(str, a);

	}

	public static void findFirstString(String str, int a) {
		String find = str.substring(0, a);
		int counter = 0;

		while (str.contains(find)) {

			str = str.replaceFirst(find, "");
			counter++;
		}

		if (counter == 1) {
			System.out.println("false");
			System.out.println(find + " appears only one");
		} else {
			System.out.println("true");
			System.out.println(find + " appears " + counter);
		}

	}

}

/*Given a string, consider the prefix string made of the first n chars of the string. Does that prefix string appear somewhere else in the string?
Assume that the string is not empty and that n is in the range from 1 till str.length().

Sample Output:

     input: abXYabc
     input: 1
     output: true
     a appears twice

     input: abXYabc
     input: 2
     output: true
     ab appears twice

     input: abXYabc
     input: 3
     output: false
     abX appears once only*/