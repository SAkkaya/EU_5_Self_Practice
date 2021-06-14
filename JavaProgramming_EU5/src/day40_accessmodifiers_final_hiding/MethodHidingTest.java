package day40_accessmodifiers_final_hiding;

public class MethodHidingTest {

	public static void main(String[] args) {
		
		

	}

}


class Bear{
	
	public static void eat() {
		System.out.println("Bear is eating");
	}
	
	
	public static void sneeze() {
		System.out.println("Bear is sneezing");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating");
	}
	
}


class Panda extends Bear{
	
	public static void eat() { // this is hiding not overriding, there is static here
		System.out.println("Panda is eating");
	}
	
	/*    //compile time error static olmadigi icin
	public void sneeze() {
		System.out.println("Panda is sneezing");
	}
	*/
	
	@Override  // olunca solda green arrow  cikar
	public void hibernate() { // this is overriding
		System.out.println("Panda is hibernating");
	}
	
	
}


