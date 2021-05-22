package day23_stringManipulationLab_randomClasss;

public class Question_11_Ozzy {

	public static void main(String[] args) {

		String str = "abc hi hohihi"; // hi 2 //hihello = substring(0,2)
										// xhihello = substring(1,3)
										// xxhihell = substring(2,4)
		int counter = 0;

		for (int i = 0; i < str.length() - 1; i++) { // 9<10    
			
			if (str.substring(i, i + 2).equals("hi")) {           // substring(9, 11)

				counter++;
			}

		}

		System.out.println(counter);

	}

}
