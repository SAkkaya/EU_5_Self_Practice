package day30_wrapperClass;

public class C10_Task98_With_ReadyMethod {

	public static void main(String[] args) {

		String str = " 3456346o234ne09*0t9890w908908o098t00h00r000e000e000";

		decodeTheCode(str);

	}

	public static void decodeTheCode(String str) {

		String str1 = "";

		for (int i = 0; i < str.length(); i++) {

			if (Character.isAlphabetic(str.charAt(i))) {
				str1 = str1 + str.charAt(i);

			}

		}

		// System.out.println(str1);

		if (str1.contains("one")) {
			System.out.print(1 + " ");

		}

		if (str1.contains("two")) {
			System.out.print(2 + " ");

		}

		if (str1.contains("three")) {
			System.out.print(3 + " ");

		}
		if (str1.contains("four")) {
			System.out.print(4 + " ");

		}
		if (str1.contains("five")) {
			System.out.print(5 + " ");

		}
		if (str1.contains("six")) {
			System.out.print(6 + " ");

		}
		if (str1.contains("seven")) {
			System.out.print(7 + " ");

		}
		if (str1.contains("eight")) {
			System.out.print(8 + " ");

		}
		if (str1.contains("nine")) {
			System.out.print(9 + " ");

		}

		if (str1.contains("zero")) {
			System.out.print(0 + " ");

		}

	}

}
