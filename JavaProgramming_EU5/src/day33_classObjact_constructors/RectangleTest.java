package day33_classObjact_constructors;

public class RectangleTest {

	public static void main(String[] args) {
		
		
		//Rectangle R1 = new Rectangle(1.5, 3.2);
		
		
		Rectangle R1 = new Rectangle();
		System.out.println(R1.length); // who is giving me default values?
		System.out.println(R1.width);
		
		R1.length=5.4;
		R1.width=3.2;
		
		R1.getArea(); //17.28
		
		//Scanner sc = new Scanner (Syste,in);   new invokes here constructer from scanner
		
		Rectangle R2 = new Rectangle();
		R2.getArea();  // 0.0 default
		R2.length=2.7;
		R2.width=12.5;
		
		R2.getArea(); //33.75
		
		
		
		
		//method(); //no argument method
		
		methodA(1,2);
		
	
		
	}

	public static void methodA(int i, int j) {
	
	}
	
	
	//New Keyword invokes the constructor
	//Which constructor?
	//accepting 2 arguments which are doubles
	
	
	// system.ou
	

}

