package day21_StringManipulation;

public class C1_String_SubString{

	public static void main(String[] args) {
		
		
		String sentence = "Java String Manipulation is fun!";
		
		System.out.println(sentence.substring(2)); //va String Manipulation is fun!
		
		System.out.println(sentence.substring(5,11));  //String
		
		System.out.println(sentence.substring(5, sentence.length()-5));  //String Manipulation is

		
		String chars= "{{}}";
		String word = "AUTOMATION";
		
		String charsWord="";
		
		charsWord=chars.substring(0,2)+word+chars.substring(2);  
		
		System.out.println(charsWord);//{{AUTOMATION}}
		
		System.out.println(word.toLowerCase()); //automation
		

	}

}
