package day5_unary_assignment_relational_operators;

public class C7_task21_incrementDecrement3 {

	public static void main(String[] args) {
		
		int x=4;
		int y = x * 4 -x++;
		
		System.out.println("x = " + x);//5
		System.out.println("y = " + y);//12
		
		
		// x in memory : 4 --> 5
		// y           : 4 * 4 - 4 => 12
				
	}

}
