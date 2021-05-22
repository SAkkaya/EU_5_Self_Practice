package day33_classObjact_constructors;

public class Rectangle {
	
	
	// instance variables
	double length;  //default value 0.0
	double width;   //default value 0.0

	
	
	public void getArea() {
		System.out.println(length * width);
	}
	
	
	// created constructor
	// accepts 2 arguments type double
	
	public Rectangle(double a, double b) {
		length = a;
		width=b;
	}
	
	
	
	public Rectangle() {  // constructor is having class name and dont have return type like methods
		
		//instantiate the object variables
		
		length=5.4;
		width=2.7;
		
	}
	
	
	public Rectangle(int a, int b) {  // constructor also can take arguments like methods
		
	}
	
	public Rectangle(int a, float b) {  // constructor also can take arguments like methods
		
	}
	
	

}

