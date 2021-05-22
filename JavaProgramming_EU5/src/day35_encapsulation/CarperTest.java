package day35_encapsulation;

public class CarperTest {

	public static void main(String[] args) {
		/*  1. Yontem
		 
		Floor f = new Floor(10,20); //public Floor(double length, double width) {
		Carpet c = new Carpet(5.2);
		
		Calculator cal = new Calculator (f, c); // i need parameters? objects belongs to  floor and carpet class
		
		System.out.println(cal.getTotalCost());
		*/
		
		Calculator cal= new Calculator( new Floor(10,20),new Carpet (5.2));
		
		System.out.println(cal.getTotalCost()); //1040.0
		
		
	}

}
