package day15_methods_part3;

public class C1_Task67_LastDigit {

	public static void main(String[] args) {
		// Write a method that accepts 2 numbers and return if they have the same last digit.
//		Sample Output
//		lastDigit(7,17) - >true
//		lastDigit(6,17) - >false
//		lastDigit(3,113) - >true

		
//		lastDigit(7,17);
//		lastDigit(6,17);
//		lastDigit(3,113);
		
		
		if (lastDigit(7,17)) {
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They do not have the same last digit");
		}
		
		
		if (lastDigit(6,17)) {
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They do not have the same last digit");
		}
		
		if (lastDigit(3,113)) {
			System.out.println("They have the same last digit");
		} else {
			System.out.println("They do not have the same last digit");
		}
		
//		boolean a= lastDigit(7, 17);
//		System.out.println(a);
//		
//		boolean b= lastDigit(6, 17);
//		System.out.println(b);
//		
//		boolean c= lastDigit(3, 113);
//		System.out.println(c);
		
	}

	public static boolean lastDigit(int num1, int num2) {
		
		if((num1%10)==(num2%10)) {
		
			return true;
			
		}else {
			
			return false;
		}
		
		
	}

}
