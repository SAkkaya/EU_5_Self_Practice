package day36_staticClassMembers;

public class Calculator {
	
	int x; //int x ===> instance variable

	
	public static double plus (double num1, double num2) {  // static method instance variable method icinde kullanmiyoruz cunku, kullansak static yazmayacaktik
		return num1+num2;
		
	}
	
	public static double minus (double num1, double num2) {
		return num1-num2;
	}
	
	public static double multiply (double num1, double num2) {
		return num1*num2;
	}
	
	
	//public static int m1() { // ==> hata verir altta x de 
		public  int m1() {  // instance method
		return x+4;  //Return de  depandency var x'e o yuzden static yazarsan uyari verir

	}
	
	
}
