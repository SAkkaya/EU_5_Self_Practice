package day39_inheritance_review_access_modifiers;

public class Car extends Vehicle{

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	
	
	public Car(String name, String size,int wheels, int doors, int gears, boolean isManual) {
		super(name, size); // super always the first statement
		
		this.wheels = wheels;
		this.doors = doors; // right side doors parameter, left side is object one-> instance variable
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear ( int currentGear) {
		this.currentGear=currentGear;
	}
	
	public void changeVelocity (int speed, int direction) {
		System.out.println("Car.changeVelocity () : Velocity " + speed + " direction " + direction);
		
		
	//	move(speed, direction); // which move method i am calling
								// eger asagidaki move method olmasa ise parent class a gidip rdaki move methodu alacakti
		
		super.move(speed, direction); // bu sekilde parent klasi calistirabiliriz
	
	}

	@Override
	public void move(int velocity, int direction) {
		// increase direction  +10 
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("Vehicle.move() : Moving at " + getCurrentVelocity() + " in direction " + getCurrentDirection());
		
	}
	
	
	
	
	
}
