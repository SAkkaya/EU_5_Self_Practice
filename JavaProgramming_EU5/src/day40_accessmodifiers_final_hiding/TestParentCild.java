package day40_accessmodifiers_final_hiding;

public class TestParentCild {

	public static void main(String[] args) {
		
		
		Child s = new Child();
		System.out.println("Value of x before increment " + s.x); //200
		
		s.increment(); // burda parent a gidiyor ordaki x=100 u 1 artirip 101 yapiyor
		
		System.out.println("Value of x after increment " + s.x); //200
		
		
		Parent p= new Parent();
		
		System.out.println("Value of p before increment " + p.x); //100
		
		p.increment();
		
		System.out.println("Value of p after increment " + p.x); //101
		
		
		
		
		
	}

}
