package day16__classObejcts;

public class C6_DogObjects {

	public static void main(String[] args) {
		
		
		
		C1_Dog dog1 = new C1_Dog();
		
		C1_Dog dog2 = new C1_Dog();
		
		C1_Dog dog3 = new C1_Dog();
		
		
		dog1.age=10;
		dog1.color="Red";
		dog1.name="Rover";
		dog1.breed="Maltese";
		
		System.out.println(dog1.age);
		System.out.println(dog1.breed);
		System.out.println(dog1.color);
		
		dog1.barking();
		dog1.hungary();
		dog1.sleeping();
		
		
		

	}

}
