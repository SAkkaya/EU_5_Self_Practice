package week8;

public class DogPark { //DogPark HAS a Dog

	public static void main(String[] args) {

		
		Dog dog1 = new Dog();  // constructor yapmazsam herbir instance i cagirmam lazim
		dog1.name = "Lucy";  //calling the instances one by one yoksa default gelir
		dog1.breed = "Husky";
		dog1.color = "White";
		dog1.gender = "Male";
		dog1.age = 10;
		
		System.out.println(dog1);
		//System.out.println(dog1.toString());  //eger objectte tostring method pamazsak herseferinde bunu ayri ayri yapmak lazim yoksa
		
		Dog dog2 = new Dog("karabaş", "Pitbull" , "Male", "White", 3 );
		
		System.out.println(dog2);
		
		
		
		
	}
}