package day22_stringManipulation_Lab;

public class C5_Question3 {

	public static void main(String[] args) {
		/* 
			Create a method return a new string made of 3 copies of the last 2
			chars of the original string. The string length will be at least 2.
			
			extraEnd("Hello") → "lololo"
			extraEnd("ab") → "ababab"
			extraEnd("Hi") → "HiHiHi" 
		*/

		System.out.println(extraEnd2("b"));        //benim cozum
		System.out.println(extraEnd2("Hello"));  //benim cozum
		System.out.println(extraEnd2("Hi"));   //benim cozum
		 
		System.out.println(repeat("abbasabas",3));  //Baris in cozum
		
		System.out.println(extraEnd("Hello")); //Ozzy cozum
		System.out.println(extraEnd("I am Java"));  //Ozzy cozum
		System.out.println(extraEnd("a"));  //Ozzy cozum
		
	
	}
	
	
	public static   String extraEnd(String str) {     //Ozzy cozum
	
		if(str.length()<2) {
			return "Invalid String";
		}
		
		String dummy ="";
		dummy = str.substring(str.length()-2);
		return dummy+dummy+dummy;
	
	}
		
	

	public static String extraEnd2(String str) {   //benim cozum
	
	if (str.length()>=2) {
			return str.substring(str.length()-2).concat(str.substring(str.length()-2)).concat(str.substring(str.length()-2));
	} else return "enter a string with more than 2 chars";
		
	
	}
	
	
	public static String repeat(String str, int tekrar) {   //Baris in cozum
		
		if(str.length()>=2) {
		
		String result=str.substring(str.length()-2);
		
		return result.repeat(tekrar);
		
		} else return "enter a string with more than 2 chars";
		
	}	

}
