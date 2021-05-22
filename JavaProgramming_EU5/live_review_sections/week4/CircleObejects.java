package week4;

public class CircleObejects {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		
		circle1.radius=3;
		
		System.out.println(circle1);  // week4.Circle@5e91993f   referans nummer
		
		//System.out.println(circle1.toString());  // convert ediyoruz 
		
		
		Circle circle2 = new Circle();
		
		circle2.radius=5;

		System.out.println(circle2);
		
	}

}
