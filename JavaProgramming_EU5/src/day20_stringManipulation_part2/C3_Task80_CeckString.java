package day20_stringManipulation_part2;

public class C3_Task80_CeckString {

	public static void main(String[] args) {
//		Write a method that accepts 2 strings(str1,str2) and prints the position index of the str2
//		if str2 is existing in str1.If it doesn’t exist, print “not found”

		// checkedString(“Your order confirmation number is XYZ”, “confirmation”) ;

		checkedString("Your order confirmation number is XYZ", "confirmation");

	}

	public static void checkedString(String str1, String str2) {

		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2)); // 11
		} else {
			System.out.println("not found");
		}

	}

}
