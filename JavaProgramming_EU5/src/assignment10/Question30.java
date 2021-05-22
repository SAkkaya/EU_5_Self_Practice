package assignment10;

public class Question30 {

	public static void main(String[] args) {

		String str = at3("longword", "foo");
		System.out.println(str);

	}

	private static String at3(String string, String string2) {

		return string.subSequence(0, 3) + string2 + string.substring(3);
	}

}

/*Question-30

at3 method gets two strings and returns a string. The first string is the one that will be manipulated. At the 3rd char position of the target you will insert the word argument.

Sample output:

     at3("longword","foo")
     return: "lonfoogword"

     at3("blabla","a")
     return: "blaabla"

*/