package day41_abstraction;

//public class Bird extends Animal{  ==> boyle idi abstract da yapabiliriz
public abstract class Bird extends Animal{  // first child of Animal needs to implement method
				//Bird is first concrete (subclass) class here
	
	
	

	@Override
	void eat() {
		System.out.println("Bird is eating");
		
	}
	
	/*
	@Override
	void breathe() {
		// TODO Auto-generated method stub
		
	}
	*/

	abstract void fly();
	
	

}
