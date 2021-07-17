package day44_oopreview.shapes;

import static day44_oopreview.shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
public class ShapeActions {

	public static void main(String[] args) {
		
		//run the drawsquare method
		
		
		
		// ShapeManager.buildShape("square"));        //Static methodlari static import edebiliriz o zaman ShapeMAnager (Class ismi)yazmaya gerek yok
		
		
		drawSquare((Square)buildShape("square"));  //public static Shape buildShape(String type) ==> burda return Type Shape oldugu icin castin yapmam gerek Square i
		//Drawing a square
		
		drawDiamond((Diamond)buildShape("diamond"));  
		//Drawing a diamond
		
		
		//drawShape((Shape)buildShape("shape"));  
		// Casting yapmana gerek yok zaten referan type Shape    
		drawShape(buildShape("shape")); //Drawing a shape
		
		
		System.out.println("---------------------------------");
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Diamond());
		
		drawShape(myList);
		
		
	}

}
