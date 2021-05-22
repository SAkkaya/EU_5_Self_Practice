package day13_methods_partI;

public class C11_PassArguments {

	public static void main(String[] args) {

		int x=10;
		
		displayValue(10); //displayValue();
		
		displayValue(x);    //The value is 10
							//The value is 20
		displayValue(x*4);  //The value is 40
							//The value is 80
	}

	public static void displayValue(int num) {

		System.out.println("The value is " + num); // 10
		System.out.println("The value is " + num*2); // 20

	}

	public static void displayValue() {

		System.out.println(" 10 "); //10

	}

}
