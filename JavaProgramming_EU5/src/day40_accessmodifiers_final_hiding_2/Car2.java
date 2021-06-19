package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class Car2 extends Car{
	
	
		public Car2() {  //creating a constructor, we did not use main method and "new" keyword to create an object
			
			//model="M3"; // different package & subclass -default ==> no access
			year=2017; // different package & subclass - public ==> has access from anywhere
			//door=4; // different package & subclass - private ==> no access
			engine=5.3; // different package & subclass - protected ==> has access
			
			
			
		}
	
	
	

}
