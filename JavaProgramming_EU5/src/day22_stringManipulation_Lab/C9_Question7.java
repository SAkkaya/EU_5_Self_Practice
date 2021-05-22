package day22_stringManipulation_Lab;

public class C9_Question7 {

	public static void main(String[] args) {
	/*	Given 2 strings, a and b, return a string of the form short+long+short,
				with the shorter string on the outside and the longer string on the
				inside.
				comboString("Hello", "hi") → "hiHellohi"
				comboString("hi", "Hello") → "hiHellohi"
				comboString("aaa", "b") → "baaab"
     */
		System.out.println(comboString("Hello", "hi"));
		
		System.out.println(comboString("hi", "Hello"));
		
		System.out.println(comboString("aaa", "b"));
		
		System.out.println(comboString("aaa", "bbb"));
		
	}

	public static String comboString(String str1, String str2) {
		
		String str;
		
		if(str1.length()>str2.length()) {
			str= str2.concat(str1).concat(str2);
			return str;
		}else{
			str= str1.concat(str2).concat(str1);
			
		}
			return str;
		}
		
		
		
//		
//		if(str1.length()>str2.length()) {
//			return str2+str1+str2;
//		}else if(str2.length()>str1.length()){
//			return str1+str2+str1;
//		}else {
//			return "Invalid";
//		}
		
		
		
	}

//}
