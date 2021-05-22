package week3;

public class C8_Faktorial {

	public static void main(String[] args) {
//		Write a program that can return the factorial number of any given number
//		        Ex:
//		            num = 5
//		            output: 120
//		            because: 5! = 5 * 4 * 3 * 2* 1 = 120
		
		
	
	System.out.println(faktorial(5));
	

	}

	public static int faktorial(int number) {
		
		int fac = 1;

		for (int i = 2; i <=number;i++) {

			
			fac = fac * i;
			
		
		}
	return fac;
		

	}

}
