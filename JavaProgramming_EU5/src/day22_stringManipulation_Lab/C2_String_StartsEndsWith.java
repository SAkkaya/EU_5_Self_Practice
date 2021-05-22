package day22_stringManipulation_Lab;

public class C2_String_StartsEndsWith {

	public static void main(String[] args) {

		String word1 = "eclipse";

		System.out.println(word1.startsWith("e"));// true

		System.out.println(word1.startsWith("ec"));// true

		System.out.println(word1.startsWith("ex"));// false

		System.out.println(word1.endsWith("e"));// true

		System.out.println(word1.endsWith("ipse"));// true
		System.out.println(word1.endsWith("xe"));// false

		// Mr. = > married man
		// Mrs. = > married woman
		// Ms. =>Some woman
		// Dr. ==>Doctor man or woman
		// No title => Unknown status

		String name = "Dr. Jackson";

		if (name.startsWith("Mr.")) {
			System.out.println("married man");
		} else if (name.startsWith("Mrs.")) {
			System.out.println("married woman");
		} else if (name.startsWith("Ms.")) {
			System.out.println("some woman");
		} else if (name.startsWith("Dr.")) {
			System.out.println("Doctor man or woman");
		} else {
			System.out.println("Unknown status");
		}

	}

}
