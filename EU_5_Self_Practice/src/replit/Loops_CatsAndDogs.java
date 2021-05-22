package replit;

public class Loops_CatsAndDogs {

	public static void main(String[] args) {
		
		String str="catdog";
		System.out.println(catDog(str));
		

	}
	
	public static boolean catDog( String str) {
		
		int counterCat=0,counterDog=0;
	
		for (int i = 0; i < str.length(); i++) {
		
			if (str.contains("cat")) {
				counterCat++;
			}
			
			if (str.contains("dog")) {
				counterCat++;
			}			
			
		}
		
		if (counterCat==counterDog) {
			return true;
		}else {
			return false;
		}
		
	}
	
	

}


/*Print true if the string "cat" and "dog" appear the same number 
 of times in the given string word.


Example:

input: catdog
output: true
input: catdog
output: true
Example:

input: catcat
output: false
input: catcat
output: false
Example:

input: cat-cheetah-dog-cat
output: false */