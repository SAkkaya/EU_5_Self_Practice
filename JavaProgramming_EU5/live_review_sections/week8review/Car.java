package week8review;

public class Car {

	public String brand, model, color;
	public int year;
	public double price;
	
	
	public Car(String brand, String model,  int year, String color, double price) {
	
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
