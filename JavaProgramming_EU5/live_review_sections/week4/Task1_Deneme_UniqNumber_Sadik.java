package week4;

public class Task1_Deneme_UniqNumber_Sadik {

	public static void main(String[] args) {
		/*
		 * write a program that can return the unique characters from a string ex:
		 * "aabcccdd"; output: bd
		 */
		System.out.println(UniqueChar("aabcccdeeefg"));

	}

	public static String UniqueChar(String str) {
		String uniqStr="";
		
		for (int i = 0; i < str.length(); i++) {
			int count = 0;
			
			char aranan = str.charAt(i); 
			
			for (int j = 0; j < str.length(); j++) {
				char arayan =str.charAt(j);
				if (aranan==arayan){
				count++;
				 }
				
			}
			if(count<2) {
			uniqStr+=aranan;
			}
		

		} return uniqStr;

	}

}
