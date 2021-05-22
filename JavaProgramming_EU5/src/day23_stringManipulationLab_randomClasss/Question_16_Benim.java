package day23_stringManipulationLab_randomClasss;

public class Question_16_Benim {

	public static void main(String[] args) {
		
		
		String str="hi";
		
		if(str.length()>=2) {
			System.out.println(str.substring(0, 2));
			
		}else {
			System.out.println(str.substring(0).concat("@"));
		}
		
		

	}

}


/*Given a string, return a string length 2 made of its first 2 chars. If the string length is less
than 2, use '@' for the missing chars.
atFirst("hello") → "he"
atFirst("hi") → "hi"
atFirst("h") → "h@"*/