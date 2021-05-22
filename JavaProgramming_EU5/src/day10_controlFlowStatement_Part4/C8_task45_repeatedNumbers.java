package day10_controlFlowStatement_Part4;

public class C8_task45_repeatedNumbers {

	public static void main(String[] args) {
		/*User should be able to declare 2 values and program should display which number is
		largest.
		if numbers are equal, it should display numbers are equal
		Above steps need to repeated to number of times that is also declared by user.*/
		
		int num1=50;
		int num2=120;
		int repeat=5;
		
		for(int i=1;i<=repeat;i++) {
			
			
			if(num1>num2) {
				System.out.println("Number1 is greater than Num2");
			}else if(num2>num1) {
				System.out.println("Number2 is greater than Num1");
			}else if(num1==num2) {
				System.out.println("Num1 is equal to Num2");
			}
			
			
			
		}
		
		

	}

}