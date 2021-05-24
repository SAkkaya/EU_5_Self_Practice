package week9review;

public class Car {
	
	private String brand, model, color;
	
	private int year;
	
	private double price;

	
	public Car(String brand) {
		
		this.brand = brand;
	}


	public Car(String brand, String model) {
		this(brand);
		this.model = model;
	}


	public Car(String brand, String model, String color) {
		this(brand, model);
		this.color = color;
	}


	public Car(String brand, String model, String color, int year) {
		
		this(brand,model,color);
		this.year = year;
	}


	public Car(String brand, String model, String color, int year, double price) {
		
		this.brand = brand;
		this.model = model;
		this.color = color;
		this.year = year;
		this.price = price;
	}


	
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", color=" + color + ", year=" + year + ", price=" + price
				+ "]";
	}
	
	
	
	
	
	

	
	

}












/*2. class name: Car
instance variables:
        brand, model, year, price, color
1st constructor: initialize the brand of the car
2nd constructor: initialize the brand and model of the car
                (MUST apply constructor Call)
3rd constructor: initialize the brand, model, year of the car
                (MUST apply constructor Call)
4th constructor: initialize the brand, model, year, price of the car
                (MUST apply constructor Call)
5th Constructor: initialize all instances of the car
                (MUST apply constructor Call)
Instance methods:
    toString()

*/