package day36_staticClassMembers;

public class CalculatorTest {

	public static void main(String[] args) {

		double result = Calculator.plus(55, 7); //static way
		
		System.out.println("Result: " + result); //Result: 62.0
		
		
		Calculator c = new Calculator();	
		System.out.println("Result: " + c.plus(55, 7)); //Result: 62.0
		
		
		int i = Integer.parseInt("33"); // static you can directly call method
		System.out.println(Character.isDigit('5')); //true==> // static you can directly call method
		
		m1();//hello==> ayni class icinde bu sekilde cagirabilirsin
		CalculatorTest.m1();  //hello==>    ya da class ismi ile de olur
	
		CalculatorTest C1= new CalculatorTest();
		C1.m1(); //hello==>  object create edip cagirabilrisin
	
	
	}
	
	public static void m1() {
		System.out.println("hello");
	}

}
