package day23_stringManipulationLab_randomClasss;

public class Question_13_Ben {

	public static void main(String[] args) {
		
	
		doubleChar("Hi-There");
		

	}

	public static void doubleChar(String str) {
		
		String output="";
		
		for (int i = 0; i < str.length(); i++) {
			output+=str.substring(i, i+1).concat(str.substring(i, i+1));
		}
		
		System.out.println(output);  //HHii--TThheerree

		
	}

}


/*Given a string, return a string where for every char in the original, there are two chars.
doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree" */

