package day36_staticClassMembers;

public class DinnerTest {
	
	public static void main(String[] args) {
		
		Dinner mom = new Dinner();
		Dinner kid = new Dinner();
		Dinner dad = new Dinner();
		
		System.out.println("Total slices : " + Dinner.pizzaSlice); //Total slices : 8
		//System.out.println("Total slices : " + mom.pizzaSlice); //Total slices : 8
		
		dad.takeASlcie();
		kid.takeASlcie();
		mom.takeASlcie();
		
		//System.out.println(dad.pizzaSlice); //5
		System.out.println(Dinner.pizzaSlice); //5
		
		kid.takeASlice(3);
		dad.takeASlice(2);
//		mom.takeASlcie();
//		System.out.println(Dinner.pizzaSlice); //-1
		
		
		System.out.println(Dinner.pizzaSlice); //0
		
		System.out.println(Math.PI); // you can directly call with class name , because it is static
							// public static final double PI = 3.14159265358979323846;
		
	}

}
