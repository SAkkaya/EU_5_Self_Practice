package week4;

public class Task2_DuplicatedCharacters_Baris {

	public static void main(String[] args) {
		
		
	/*Write a program that can remove duplicated characters from a string
		ex:
			str = "aaaabbbbbbcccccccccdddd"
			output:
				abcd
	*/
		

		String a = "ssadrr";
        int count = 0;
        for (int i = 0; i < a.length(); i++) {
        	count = 0;
            for (int j = 0; j < a.length(); j++) {
                if (a.charAt(i) == a.charAt(j)) {
                    count++;
                }

            }
            if (count == 1) {
                System.out.print(a.charAt(i));
            }

        }

    }
}