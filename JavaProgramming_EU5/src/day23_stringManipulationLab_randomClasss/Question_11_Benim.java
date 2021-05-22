package day23_stringManipulationLab_randomClasss;

public class Question_11_Benim {    //substring more professional charAt e gore OZzzy nin yaptigi gibi

	public static void main(String[] args) {

		
		System.out.println("number of hi : " + countHi(" hih hi abc hi ho hi"));

	}

	public static int countHi(String str) {

		String content = "";
		int count = 0;

		for (int i = 0; i < str.length(); i++) {

			content += str.charAt(i);

			if (content.contains("hi")) {
				
				content="";
				
				count++;
			}

		}
		
		return count;
	}

}

/*
 * Return the number of times that the string "hi" appears anywhere in the given
 * string. countHi("abc hi ho") → 1 countHi("ABChi hi") → 2 countHi("hihi") → 2
 */