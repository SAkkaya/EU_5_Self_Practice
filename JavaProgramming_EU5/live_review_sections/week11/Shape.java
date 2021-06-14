package week11;

public class Shape { //parents class
	
	
	// public static String name; // circle, rectangle  farkli object olusturdugumuzda isimleri hep ayni olur
	
public String name;
	
	public Shape(String name) {
		this.name = name;
	}
	
	
	public double area() {
		return 0;
	}
	
	public double perimeter() {
		return 0;
	}



	public String toString() {
		return "Shape [name= " + name + ", area= " + area() + ", perimeter= " + perimeter() + "]";
	}
	
	
	
}


// circle , rectangle