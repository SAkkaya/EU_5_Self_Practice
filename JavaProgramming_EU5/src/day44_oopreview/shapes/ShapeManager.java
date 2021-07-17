package day44_oopreview.shapes;

import java.util.List;

public class ShapeManager {
	
	public static Shape buildShape(String type) {  //type kismi dainemik object yaratmak icin 
		
		Shape shape=null;  //local variables need to be initialized
		
		switch (type.toLowerCase()) {
		case "shape":
			shape = new Shape();
			break;
		case "square":
			shape= new Square();
			break;
		case "diamond":
			shape= new Diamond();
			break;	
		
		}
		
		return shape;
		
	}
	
	// whay is the static methods?  if a method does not use an instance method then use static method
	
	public static void drawSquare(Square squareObject) { //Object as a parameter here ==> (Square squareObject) 
		//draw method from square class
		squareObject.draw();
	
	}
	
	public static void drawShape(Shape shapeObject) {
		//draw method from shape class
		shapeObject.draw();
	
	}
	
	
	public static void drawDiamond( Diamond diamondObject) {
		diamondObject.draw();
	}
	
	
	public static void drawShape(List<Shape> shapeList) { //Arraylist from list
		// I want to run each draw method
		
		for (Shape each: shapeList) {
			each.draw();
		}
		
		
		
		
		
	}
	

}
