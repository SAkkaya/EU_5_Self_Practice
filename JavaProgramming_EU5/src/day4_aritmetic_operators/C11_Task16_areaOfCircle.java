package day4_aritmetic_operators;

public class C11_Task16_areaOfCircle {

	public static void main(String[] args) {
		// Write a Java program that displays the area and perimeter of a circle 
		//that has a radius of 5.5 using the following formulas:
		
		//perimeter = 2 * radius * pi
		//area = radius * radius * pi
		
		final double PI=3.14;
		
		double perimeter, area, radius=5.5;
		
		//radius=5.5;
		
		perimeter = 2 * radius * PI;
		area = radius * radius * PI;
		
		System.out.println("Area of the Circle is " + area);
		System.out.println("Perimeter of the Circle is "+ perimeter);
		
	}

}
