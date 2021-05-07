package self;

public class C10_MethodOverloading {

	public static void main(String[] args) {
		
		addNumbers(200); //calling addNumbers(int num) | result is 300
		
		addNumbers(10, 20); //calling addNumbers(int num1, int num2) | result is 30
		
		addNumbers(10, 20, 30 );//calling addNumbers(int num1, int num2, int num3) | result is 60
		
		addNumbers(10.99d, 20.99d); //calling addNumbers(double num1, double num2) | result is 31.979999999999997
		

	}
	
	
	public static void addNumbers(double num1, double num2) {
		System.out.println("calling addNumbers(double num1, double num2) | result is " + (num1+num2));
	}
	
	
	public static void addNumbers(int num) {
		
		System.out.println("calling addNumbers(int num) | result is " + (num+100));
		
	}
	
	public static void addNumbers(int num1, int num2) {
		System.out.println("calling addNumbers(int num1, int num2) | result is " + (num1+num2));
	}
	
	public static void addNumbers(int num1, int num2, int num3) {
		System.out.println("calling addNumbers(int num1, int num2, int num3) | result is " + (num1+num2+num3));
	}

}













