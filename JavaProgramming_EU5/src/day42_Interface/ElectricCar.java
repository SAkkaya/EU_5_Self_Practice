package day42_Interface;

public abstract class ElectricCar {
	
	private String model;
	private double price;
	private String color;
	
	
	//I will not reassign this instance values so i will need setters methods, 
	//i put all values at once by constructor here
	
	public ElectricCar(String model, double price, String color) {
		this.model = model;
		this.price = price;
		this.color = color;
	}
	
	public abstract void start(); //What TODO, instead of HOW TODO
	public abstract void charge();
	public abstract void drive();
	
	
	public void stop() {
		System.out.println("Electric car is stopping by pushig the break...");
	}

	public String getModel() {
		return model;
	}

	public double getPrice() {
		return price;
	}

	public String getColor() {
		return color;
	}
	
	
	
	//I will not reassign this instance values so i will need setters methods, 
	//i put all values at once by constructor here

//	public void setModel(String model) {
//		this.model = model;
//	}
//
//	public void setPrice(double price) {
//		this.price = price;
//	}
//
//	public void setColor(String color) {
//		this.color = color;
//	}

	@Override
	public String toString() {
		return "ElectricCar [model=" + model + ", price=" + price + ", color=" + color + "]";
	}
	
	
	
	
	
	
	

}
