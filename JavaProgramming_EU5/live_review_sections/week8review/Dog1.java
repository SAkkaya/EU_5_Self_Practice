package week8review;

public class Dog1 {
	
	public String name, breed, gender, color;
	public int age;
	
	public Dog1() {
		
	}
	
	public Dog1(String name, String breed, String gender, String color, int age) {
		this.name = name;
		this.breed = breed;
		this.color = color;
		this.gender = gender;
		this.age = age;
		
	}
	
	
	
	
	public void bark() {
		System.out.println(name+" is barking");
	}


	
	public String toString() {
		return "Dog [name=" + name + ", breed=" + breed + ", gender=" + gender + ", color=" + color + ", age=" + age
				+ "]";
	}


	
	
	
}
