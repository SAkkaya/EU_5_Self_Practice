package week8;

public class Dog {
	
	public String name, breed, gender, color;  //instance variable
	public int age;
	
	public Dog() {
		
	}
	
	public Dog(String name, String breed, String gender, String color, int age) { //local variable burasi

		
//		name = name;   //name (local variable) = name; (local variable) 
//		breed = breed;
//		color = color;
//		gender = gender;
//		age = age;  
		
		this.name = name;   //this.name (instance variable) = name; (local variable) 
		this.breed = breed;
		this.color = color;
		this.gender = gender;
		this.age = age;
		
		// this refers to instance variable/compiler calls the instance variable instead of local variable.
		//this. : we only use it to call instance variable if local variable is having the same name as instance variable
	}
	
	
	
	
	public void bark() {
		System.out.println(name+" is barking");
	}


	// in order to print any object you have to use To String method to conver object to String
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", gender=" + gender + ", color=" + color + ", age=" + age
				+ "]";
	}


	
	
	
}
