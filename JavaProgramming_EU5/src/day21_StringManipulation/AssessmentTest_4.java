package day21_StringManipulation;

public class AssessmentTest_4 {

	public static void main(String[] args) {
		
		int total=0;
		String letters ="abcdesfg";
		
		total+=letters.substring(1, 2).length();//1
		total+=letters.substring(6, 6).length(); //0
		total+=letters.substring(5, 6).length();//1
		
		System.out.println(total);//2

	}

}
