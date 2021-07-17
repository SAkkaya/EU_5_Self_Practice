package day44_oopreview.callcenter;

public interface VoiceCallable {
	/*  - interface variables must be public static final	==> as default 
	- abstract variables can have any static or instance variables 
	
	-/if we have a final variable we have to instantiate it by 3 ways in regular class
	
	1) at the same line
	2) by constructor
	3) instance bloc
	
	Interface can not have constructor and instance bloc
	
	*/
	
	
	boolean CAN_CALL = true;      // public static final boolean CAN_CALL= true       olarak JVM anliyor default olarak          
	
	// abstract method           ( Interfaces can have abstract method
	void call(String contact); // public abstract void call( String contact)
	
	//static method
	
	//static method                  =>( you cannot override it , only by another static method, hidin yapabilirsin)
	public static void decline() {        // static methodda implementation koyman gerekir sadece abstarct classlarda implementation koymazsin 
		System.out.println("Mike declined voice call..");
	}
	
	//default (not access modifiers only a keyword here)      ==> you cannot override it
	public default void accept() { // burda access modifiers ==>
								// default access modifiers degil!!!!!!!
		
		System.out.println("Mike  finally accepted voice call...");
	}
	
	

}
