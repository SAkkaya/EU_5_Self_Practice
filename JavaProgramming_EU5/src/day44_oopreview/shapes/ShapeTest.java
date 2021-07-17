package day44_oopreview.shapes;

public class ShapeTest {

	public static void main(String[] args) {
		
		//create 3 shapes, using polymorphism
		
		Shape diamond = new Diamond();
		Shape square = new Square();
		Object shapeObject = new Shape();  //Object parents of all classes
		
		System.out.println(diamond.type); //diamond
		diamond.draw(); //Drawing a diamond
		

		System.out.println(square.type); //square
		square.draw(); //Drawing a square
		
		((Square) square).squareMethod();//Square method	
									//	Shape square = new Square();
									// referenceType decides  so - yaniShape (left side), there is no squareMethod() in Shape so 
									// we need to go SquareClass ( so must do casting)
	
		

	}

}
