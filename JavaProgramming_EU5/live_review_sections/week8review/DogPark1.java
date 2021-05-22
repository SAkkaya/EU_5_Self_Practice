package week8review;

public class DogPark1 { //DogPark HAS a Dog

	public static void main(String[] args) {

		
		Dog1 dog1 = new Dog1();  // constructor yapmazsam herbir instance i cagirmam lazim
		dog1.name = "Lucy";  //calling the instances one by one yoksa default gelir
		dog1.breed = "Husky";
		dog1.color = "White";
		dog1.gender = "Male";
		dog1.age = 10;
		
		System.out.println(dog1);
		
		
		Dog1 dog2 = new Dog1("karabaş", "Pitbull" , "Male", "White", 3 );
		
		System.out.println(dog2);
		
		
		
		
	}
}