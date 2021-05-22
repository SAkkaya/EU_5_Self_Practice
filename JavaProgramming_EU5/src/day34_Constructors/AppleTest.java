package day34_Constructors;

public class AppleTest {

	public static void main(String[] args) {
			//a1 ==> instance variable
		Apple a1 = new Apple();  // default constructor creating object
		
		System.out.println(a1.color);// Red
		
		
		changeApple(a1); // methodu cagirinca color Red den white olacak objenin
		System.out.println(a1.color); // white	
		
		System.out.println(methodObject().color); // holding b1 object
				//Red
	}
	
	public static void changeApple(Apple x) {
		x.color = "White";  //ikiside (x) ayni parameter olmali isimleri ayni) ler ayni olmali 	
		
	}
	

	
	//I want to return object
	//which object?
	//object belongs to Apple class
	public static Apple methodObject() { //return type Class  name olmali 
						//return object yapmak istedigimizde
		
		Apple b1 = new Apple();
		return b1;
			
		
	}
	
	
	
	
	
	
}
