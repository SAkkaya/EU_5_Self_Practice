package day30_rehearsal;

public class WrapperClassMethods {

	public static void main(String[] args) {
		
		
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
	
		
		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		
		System.out.println(Character.isAlphabetic('a')); //true
		System.out.println(Character.isAlphabetic('1'));  // false
		System.out.println(Character.isAlphabetic('&'));  // false
	
		System.out.println(Character.isLetter('j'));  //true
		System.out.println(Character.isLetter('1'));  // false
		System.out.println(Character.isLetter('&'));  // false
		
		System.out.println(Character.isDigit('5')); //true
		System.out.println(Character.isDigit('p')); //false
		
		String word = "java101";
		System.out.println(Character.isAlphabetic(word.charAt(0))); //true
		System.out.println(Character.isDigit(word.charAt(6))); //true
		
		
		
		
		
	}

}
