package day44_oopreview.callcenter;

public abstract class MessagingApp {
	
	public String name; // 
	
	protected boolean isFree;             
	boolean allOSCompatible;
	private static int count;
	public static final String APP_Type = "Messenger"; //static=> assign to class level, final=> you can use one time , cannot change 
	
	//static variables belongs to class, instance variable belongs to object, local variable belongs to method
	
	
	public MessagingApp(){
		System.out.println("MessagingApp no-args constructor...");
	}

	
	public MessagingApp(String name, int count) {
		this.name = name;
		MessagingApp.count=count; // static method belongs to class , so i call method by class name
	}

	public abstract void sendMessage(String msg); // no implememtation
	
	
	public void launch() {
		System.out.println("MessagingApp is closing...");
	}
	
	public static void close() {
		System.out.println("MessagingApp is closing...");
		
	}
	
	//getter and setter
	public static int getCount() {
		return count;
	}
	
	public static void setCount(int count) { // this ==> represents the current object
												//this() ==> constructor chaining, if we have a couple of constructors in same class
												//we can call one constructor from another constructor through this() keyword
		MessagingApp.count = count;
	}
	
	
	
	
	
	
	

}
