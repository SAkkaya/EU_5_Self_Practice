package day38_inheritance_part2;

public class Student  extends Person{

	@Override
	public void message() {
		System.out.println("This is student class");
	}

	public void display() {
		message();  //This is student class
		super.message(); //This is person class
	}
	
	
	
	

}
