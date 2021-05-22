package day33_classObjact_constructors;

public class CarTest {

	public static void main(String[] args) {
		
		
		Car c1 = new Car();
		
		Car c2 = new Car("Honada", "Civic", 2020, 05000, "white");
		

		// 1 - new - call constructor
		// 2 - which constructor?
		// 3 - constructor with no parameter in Car class -		
		
		Car c3= new Car("BMW", "320", 2017, 30000, "red");
		
		System.out.println(c1.make); //Civic
		System.out.println(c2.make); //Civic
		System.out.println(c3.make); //320

		
		
		

	}

}

