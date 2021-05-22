package week8review;

public class CarShop {

	public static void main(String[] args) {

		Car[] cars = { new Car ("TOYOTA", "Corolla", 2009, "Blue", 10000 ), 
				new Car ("OPEL", "Corsa", 2009, "White", 6000 ),
				new Car ("BMW", "3.20", 2012, "Black", 12000 ),
				new Car ("BMW", "5.20", 2018, "White", 16000 ),
				new Car ("MERCEDES", "C200", 2009, "Grey", 9000 )};
		
		for (Car each : cars) {
			
			if (each.brand.equalsIgnoreCase("TOYOTA") && (each.year<=2010 && each.year>=2008)) {
				System.out.println(each.brand+ " " + each.model + " ==> recall this car");
			}
			
			if (each.brand.equalsIgnoreCase("BMW") && (each.year<=2014 && each.year>=2011)) {
				System.out.println(each.brand +  " " + each.model + " ==> recall this car");
			}
			
		}
		
	
	}

}
