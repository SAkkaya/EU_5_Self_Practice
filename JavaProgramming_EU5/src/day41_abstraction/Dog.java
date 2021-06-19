package day41_abstraction;

public class Dog extends Animal{ // you dont have to override instance method but you have to override abstract method

	@Override
	 void eat() {
		System.out.println("Dog is eating");
	}

	@Override
	 void breathe() {
		System.out.println("Dog is breathing");
	}

//	@Override    implementaioni burda override ederek animal class i yapmak zorunda degilim
//	public void eat() {
//		System.out.println("Dog is eating");
//	}
	
	
	
	
	
}
