package day23_stringManipulationLab_randomClasss;

public class Question_17_Palindrome_Benim {

	public static void main(String[] args) {
		// level, racecar, top spot, wow  ==>tersten okunusu duzden okunusu ile ayni
		
		System.out.println(palindrom("racecar")); //true
		System.out.println(palindrom("top spot"));//true   <==  if(reverseStr.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
		System.out.println(palindrom("topspot"));//true
		System.out.println(palindrom("level"));//true
		System.out.println(palindrom("levelo"));//false
		
	}

	public static boolean palindrom(String str) {
		String reverseStr="";
		
		for(int i=str.length()-1; i>=0;i--) {
			reverseStr+=str.charAt(i);
		}  
		
		
		if(reverseStr.replace(" ", "").equalsIgnoreCase(str.replace(" ", ""))) {
			return true;
			
		}else {
			return false;
		}
		
	}

}


/*Write a method that accepts a string
and returns true if the string is
palindrome.*/