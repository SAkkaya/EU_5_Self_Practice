package day13_methods_partI;

public class C17_Task63 {

	public static void main(String[] args) {
		
		//Write a function that accepts Fahrenheit and displays the Celcius in the console.
//		Sample Output:
//			calculateCelcius(32) -- > 0
//			calculateCelcius(50) --> 10
		
		covertFahrenheitToCelcius(32);
		covertFahrenheitToCelcius(50);
		
		
		

	}

	public static void covertFahrenheitToCelcius(double Fahrenheit) {
		
		
	
		double Celcius=(Fahrenheit-32)/1.8;
		System.out.println(Celcius);
		
	}
	
	

}
