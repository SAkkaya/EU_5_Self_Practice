package day22_stringManipulation_Lab;

public class C8_Question6 {

	public static void main(String[] args) {
		/* Given a string, return a version without the first and last char, so
				"Hello" yields "ell". The string length will be at least 2.
				withoutEnd("Hello") → "ell"
				withoutEnd("java") → "av"
				withoutEnd("coding") → "odin"
		 */
		
		System.out.println(withoutEnd("Hello"));
		System.out.println(withoutEnd("java"));
		System.out.println(withoutEnd("coding"));
		
	}

	public static String withoutEnd(String str) {
		
		if(str.length()<2) {
			return "The string length will be at least 2 chars";
		} // else {            ==> else olmasa da olur
			
			return str.substring(1,str.length()-1);
			
		}
		
		
	}

//}
