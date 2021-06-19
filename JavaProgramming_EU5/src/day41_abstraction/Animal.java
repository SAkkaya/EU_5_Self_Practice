package day41_abstraction;

public abstract class Animal {  // abstract method can have both abstract and instance method
						// if there is a  abstract method in a class that class name must be astract too
	
	
	//Instance variable
	String name;
		
	//Static variable
	private static int age;
	
	//Abstract method
	abstract void eat();  //Abstract method  ==> there is body, so there is no curly braces 
	
	//Abstract Method
	abstract void breathe();
		
	//Instance method
	private void sing() {
		System.out.println("Animal is singing");
	}
	
	//Constructor

	public Animal() {

	}

	public Animal(int age) {
		this.age=age;
	}
		
	//Instance block
	{
		System.out.println("This is instance block");
	}
		
	//Static block
	static {
		System.out.println("This is static block");
	}

}



