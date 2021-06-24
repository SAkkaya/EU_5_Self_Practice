package day42_Interface;

public interface IElectric {
	
	
	public static final boolean HAS_BATTERIES = true;
	
	boolean HAS_BATTERIES2 = false; // public final static as a default
	
	public abstract void charge();
	
	void charge2(); // public abstract    ==> interface de ki method otomaticly public abstract method
	
										//	==> even if you dont write it it is public abstract method

	
	//********Interfaces cannot have instance method, but abstract with no body, with body ==>default or static methods **************
	
//	public  void methodA() {   // ERROR ==>Interfaces cannot have instance method,	
//	}
	
	
	public default void methodA() {
		//code
	}
	
	
	public static void methodB() {
		//code
	}
	
	
}
