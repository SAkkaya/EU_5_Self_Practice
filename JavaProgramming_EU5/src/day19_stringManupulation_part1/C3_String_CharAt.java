package day19_stringManupulation_part1;

public class C3_String_CharAt {

	public static void main(String[] args) {
		
		String word =  "Computer"; // 0-1-2-3-4-5-6-7- en buyuk 7. index o yuzde char(8) yazarsak " out of bound error "aliriz
		
		System.out.println(word.length());
		
		System.out.println(word.charAt(0));
		System.out.println(word.charAt(1));
		System.out.println(word.charAt(2));
		System.out.println(word.charAt(3));
		System.out.println(word.charAt(4));
		System.out.println(word.charAt(5));
		System.out.println(word.charAt(6));
		System.out.println(word.charAt(7));
		//System.out.println(word.charAt(8));
		
		
		//check if first Character is 'A'
		String word2 =  "Apple"; 
		
		if (word.charAt(0)=='A') {
			System.out.println("A is first character");
		}else {
			System.out.println("A is not first character");
		}
		
		// Check if first and last characters are same
		
		String word3="civic";
		
		if (word3.charAt(0)==word3.charAt(4)) {
			System.out.println("first and last character are same");		
			
		}else {
			System.out.println("first and last character are not same");		
		}
		
		//last index not hard coded
		
		String word4 ="Java Script";
		
		char lastChar = word4.charAt(word4.length()-1);
		
		System.out.println("Last char of " + word4 + " is " + lastChar);
		
		
	}

}
