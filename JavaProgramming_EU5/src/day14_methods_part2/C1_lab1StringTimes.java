package day14_methods_part2;

public class C1_lab1StringTimes {

	public static void main(String[] args) {
		/* Question-1

				Write a method that accepts a string and a non-negative number, and prints a larger string that is number copies of the original String
				
				stringTimes("Hi", 2); = > HiHi
				stringTimes("Hi", 3); = > HiHiHi
				stringTimes("Hi", 1); = > Hi    */
		
		stringTimes("Hi", 6);
		
	
	}

	public static void stringTimes(String str, int number ) {
		
		for (int i = 1; i <=number; i++) {
			
			System.out.print(str);
		}
		
		
	}
	
	
	
	

}
