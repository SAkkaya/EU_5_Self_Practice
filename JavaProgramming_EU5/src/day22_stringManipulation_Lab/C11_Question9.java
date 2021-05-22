package day22_stringManipulation_Lab;

public class C11_Question9 {

	public static void main(String[] args) {
		/*Given a string, return a "rotated right 2" version where the last 2 chars
				are moved to the start. The string length will be at least 2.
				right2("Hello") → "loHel"
				right2("java") → "vaja"
				right2("Hi") → "Hi"
				
				*/
		
		System.out.println(right2("Hello"));
		System.out.println(right2("java"));
		System.out.println(right2("Hi"));
		
		
	}

	public static String right2(String str) {
		
		if (str.length()<2) {
			return "Invalid";
		}
		
		return str.substring(str.length()-2).concat(str.substring(0,str.length()-2));
		
		
	}

}
