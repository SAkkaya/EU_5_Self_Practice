package day30_wrapperClass;

public class C8_WrapperClassMethods {

	public static void main(String[] args) {
		
		System.out.println(Byte.MIN_VALUE); //-128
		System.out.println(Byte.MAX_VALUE); //127
		
		System.out.println(Integer.MIN_VALUE); //-2147483648
		System.out.println(Integer.MAX_VALUE); //		2147483647
		
		System.out.println(Character.MIN_VALUE); //
		System.out.println(Character.MAX_VALUE);
		
		System.out.println(Character.isAlphabetic('a')); //true
		System.out.println(Character.isAlphabetic('1')); //false
		
		System.out.println(Character.isLetter('j')); //true
		System.out.println(Character.isLetter('&')); //false
		
		System.out.println(Character.isDigit('5')); //true
		System.out.println(Character.isDigit('p'));//false
		
		String word = "java101";
		System.out.println(Character.isAlphabetic(word.charAt(0))); //true
		System.out.println(Character.isDigit(word.charAt(6))); //true
		 
		
		
		

	}

}
