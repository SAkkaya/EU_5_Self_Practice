package muhtar_only;

public class C2_multplywithOutOperator {

	public static void main(String[] args) {
		// write a program that can multiply two numbers without using * operator
		

		

		System.out.println(multiplyWithout(7, 8));
	
	}
		
		public static int multiplyWithout(int num1, int num2) {
			
			int total=0;
			for (int i = 1; i <= num2; i++) {
			total+=num1;
		}
			return total;
		
		}
		


	}


