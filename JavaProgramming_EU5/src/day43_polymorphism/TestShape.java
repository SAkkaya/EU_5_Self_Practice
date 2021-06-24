package day43_polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw(); //Drawing a shape

		Shape s2 = new Circle();     // overriden yaptigi icin circle class icinde shape in methodunu ircle yazdirir
		
		s2.draw(); //Drawing a circle                  //eger override i kaldirirsak circle icinde ==>Drawing a shape yazdirirdi super yani parent classdaki methodu
	//check circle class and if there overriden (draw) method , run it
		
	}

}
