package day35_encapsulation;

public class PersonTest {

	public static void main(String[] args) {

		
		Person p = new Person();
		//p.age=-10;//Not a valid age  // private oldugu icin age hata verir o yuzden setter ile method yaptik methodu call edcegiz
		
		p.setAge(20);  
		System.out.println(p.getAge());  //20
		
		
		// Encapsulation 
		
		//cut the access - private
				//no visible to PersonTest class (age) p.age =-10;
		// create setter method to initialize my value
		// create getter method to retrieve it
		
		
		//3 things to know and call the Encapsulation
				//1. private variables  ==> make the variable private
				//2. public setter methods => to able to set the values
				//3. public getter methods   => to retrieve values
		
	}

}
