package day30_wrapperClass;

public class C10_Task98_WithOut_ReadyMethod {

	public static void main(String[] args) {

		String str = " 3456346o234ne09*0t9890w908908o098t00h00r000e000e000";

		decodeTheCode(str);

	}

	public static void decodeTheCode(String str) {
		int i = 0;
		String strNumber = "";

		while (i < str.length()) {

			if ((str.charAt(i) >= 65 && str.charAt(i) <= 90) || (str.charAt(i) >= 97 && str.charAt(i) <= 122)) {

				strNumber += str.charAt(i); //" 3456346o234ne09*0t9890w908908o098t00h00r000e000e000";

				if (strNumber.equalsIgnoreCase("one")) {
					System.out.print(1);
					strNumber = strNumber.replaceFirst("one", "");
				}
				if (strNumber.equalsIgnoreCase("two")) {
					System.out.print(2);
					strNumber = strNumber.replaceFirst("two", "");
				}
				if (strNumber.equalsIgnoreCase("three")) {
					System.out.print(3);
					strNumber = strNumber.replaceFirst("three", "");
				}
				if (strNumber.equalsIgnoreCase("four")) {
					System.out.print(4);
					strNumber = strNumber.replaceFirst("four", "");
				}
				if (strNumber.equalsIgnoreCase("five")) {
					System.out.print(5);
					strNumber = strNumber.replaceFirst("five", "");
				}
				if (strNumber.equalsIgnoreCase("six")) {
					System.out.print(6);
					strNumber = strNumber.replaceFirst("six", "");
				}
				if (strNumber.equalsIgnoreCase("seven")) {
					System.out.print(7);
					strNumber = strNumber.replaceFirst("seven", "");
				}
				if (strNumber.equalsIgnoreCase("eight")) {
					System.out.print(8);
					strNumber = strNumber.replaceFirst("eight", "");
				}
				if (strNumber.equalsIgnoreCase("nine")) {
					System.out.print(9);
					strNumber = strNumber.replaceFirst("nine", "");
				}
				if (strNumber.equalsIgnoreCase("zero")) {
					System.out.print(0);
					strNumber = strNumber.replaceFirst("zero", "");
				}

			}

			i++;
		}

		System.out.println(strNumber);

	}

}

