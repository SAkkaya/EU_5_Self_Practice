package day20_stringManipulation_part2;

public class C4_String_Replace {

	public static void main(String[] args) {
		
		
		String str ="Moskow is a capital of Russia";
		
		str=str.replace("Moskow", "Baku").replace("Russia", "Azerbaican");
		System.out.println(str);//Baku is a capital of Azerbaican
		
		
		String email ="firstName_LastName@gmail.com";
		System.out.println(email);
		
		String company="capitalone";
		String newEmail=email.replace("gmail", company);
		System.out.println(newEmail);
		
		

	}

}
