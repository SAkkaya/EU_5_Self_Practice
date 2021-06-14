package day40_accessmodifiers_final_hiding_2;

import day40_accessmodifiers_final_hiding.Car;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		//c.model="M3"; // different package-default ==> no access
		c.year=2017; // different package - public ==> has access from anywhere
		//c.door=4; // different package - private ==> no access
		//c.engine=5.3; // different package - protected ==> no access
		
		
	}

}
