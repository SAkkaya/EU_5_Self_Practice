package day43_polymorphism;

public class ShapesArray {

	public static void main(String[] args) {
		
		
		Shape [] shapes = new Shape[3];    // Object Array  ==> holding 3 objects
		
		int [] x = new int [3]; // holding 3 int value
		
		//shapes[0]=new Shape();  
		
		shapes[0]=new Square();  

		shapes [1]= new Triangle();  //polymorpisim => whatever shapes belong ==> Shape Class
		
										// Shape is the parent of Triangle , so polymorpisim
		shapes [2]= new Circle();
		
		//for each methods
		for (Shape sh : shapes) {
			
			//System.out.println(sh.getClass()); //help us to acces the object information==>//class day43_polymorphism.Square
			//System.out.println(sh.getClass().getName()); //package name 	//day43_polymorphism.Square
			System.out.println(sh.getClass().getSimpleName()); // directly gives class name //Square
			
			sh.draw();  // do you know which class running from 
		}
		
		//for loop methods
		
//		for(int i = 0; i< shapes.length; i++) {
//			shapes[i].draw();
//		}

	}

}
