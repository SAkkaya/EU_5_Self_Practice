package day33_classObjact_constructors;

public class Car {
	
	
	String model;  //object instance value
	String make;
	int year;
	double mile;
	String color;
	
	
	//create constructor
	
	
	public Car() {   // no return + Calls Name
		
		
		model = "Honda";
		make = "Civic";
		year = 2020;
		mile=  5000;
		color = "red";
		
		
	}
/*	
	public Car( String mo, String ma, int yr, double ml, String cl) {
		
		model=mo;
		make= ma;
		year = yr;
		mile =ml;
		color = cl;
			
	}
	
	
	public Car(String model, String make, int year, int mile, String color) { //parameter
		
//		model=model;   // sagdaki parameter, left one represent object instance value
//		make =make;
//		year=year;
//		mile =mile;
//		color=color;
		
		this.model=model;   // sagdaki parameter, left one represent object instance value
		this.make =make;
		this.year=year;
		this.mile =mile;
		this.color=color;
		
		
	}

*/
	
	//Right click--> Source  --> Generate Constructor using Fields
	public Car(String model, String make, int year, double mile, String color) {
		
		this.model = model;
		this.make = make;
		this.year = year;
		this.mile = mile;
		this.color = color;
	}
	
	
	
	
	
	public Car(int year, double mile) {
	
	this.year = year;
	this.mile = mile;
	}


	
	
	
	
	
	
	
	
	
	// 2 things need to be clear
	
	//1- how we create it
	//2 - What are those constructors responsibilities?
	
	
	

}
