package Barisile;

public class C10_JavaCharBulmaForLoop {

	public static void main(String[] args) {
		
		String word="J73487635867+%%&/a76867v*/*/a**/***--";
	    char letter=' ';    
	    for (int i = 0; i < word.length(); i++) {
	            letter=word.charAt(i);
	            if (letter>=65&&letter<=90||letter>=97&&letter<=122) {
	                System.out.print(letter);
	            }
	        }
	        	
	

	}

}
