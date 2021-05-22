package day13_methods_partI;

public class C8_Task58_GreaterNumber {

	public static void main(String[] args) {
		
		findGreater();
		
	
	}

	private static void findGreater() {
		
		int num1=35;
		int num2=15;
		
		if (num1>num2) {
			System.out.println("number 1 is bigger");
		} else if (num2>num1){
			System.out.println("number 2 is bigger");
		} else {
			System.out.println("numbers are equal");
		}
		
	}

}
