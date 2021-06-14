package week11;

import java.text.DecimalFormat;

public class Circle extends Shape{
	
	public double radius;
	
	public final static double PI;   // only one copy PI enough, so we made it => static
									// final yazinca hemen variable i atamak gerekir
	
	static {
		PI=3.14;          // butun circle olusturulur olusturulmaz hemen atayacak 
						//ilerde baska circle olusturursak her seferinde 3 -4 ilave step yapmak zorunda initiliase icin gerekecekti
	}
	
//	{                        // instance blok kulnma limited olur
//		radius=3.5;
//	}
	
	
	
	
	public Circle(double radius) {
		super("Circle");  //hard coded yapacak isim degismeyecegi icin Circle hep circle o yuzden asagidaki gibi yapmiyoruz
		this.radius=radius;
	}
	
//	public Circle(String name, double radius) {
//	super(name);
//	this.radius = radius;
//}

	@Override
	public double area() {
		return radius * radius * PI;
	}
	
	@Override
	public double perimeter() {
		return radius*2 * PI;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Circle [radius= " + radius 
				+ ", area= " + df.format( area() )
				+ ", perimeter= " + df.format( perimeter() )+ "]";
	}
	
	
	
	
	

}

	


