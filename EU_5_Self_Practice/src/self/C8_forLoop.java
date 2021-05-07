package self;

public class C8_forLoop {

	public static void main(String[] args) {
		/*
		 * 3. write a program that can return the frequency of characters from a string
		 * Ex: str = "aabbbc"
		 * 
		 * output: a2b3c1
		 */

		retFreq("aabbbc");

	}

	public static String retFreq(String str) {
		
		String sum;
		int count=0;
		
		for (int i = 0; i < str.length(); i++) {

			for (int j = 0; j < str.length(); i++) {
				if (str.charAt(i) == str.charAt(i)) {
					count++;
					
				} 
				
				return sum;

			}
		}

	}

}
