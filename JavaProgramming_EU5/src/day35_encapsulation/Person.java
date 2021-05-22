package day35_encapsulation;

public class Person {
	
	public String name;
	private int age;   // only visible to current class
	public char gender;
	
	
	//setters
	public void setAge(int age) {
		
		if (age <0) {
			System.out.println("Not a valid age");
		}
		this.age=age;   
	}
	
	//getter
	
	public int getAge() {
		return age;
	}

}
