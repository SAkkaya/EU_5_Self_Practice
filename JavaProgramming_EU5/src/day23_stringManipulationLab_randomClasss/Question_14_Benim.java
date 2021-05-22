package day23_stringManipulationLab_randomClasss;

public class Question_14_Benim {

	public static void main(String[] args) {
		
	
		System.out.println(endsLy("oddly")); // true
		System.out.println(endsLy("y")); //false
		System.out.println(endsLy("oddy"));// false
	}

	public static boolean endsLy(String str) {
		
		if (str.length()>=2)
		
			if(str.substring(str.length()-2).equalsIgnoreCase("ly")) {
			return true;
			}else {
			return false;
		}else {
			return false;
		}
	}

}


/*Given a string, return true if it ends in "ly".
endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false */

