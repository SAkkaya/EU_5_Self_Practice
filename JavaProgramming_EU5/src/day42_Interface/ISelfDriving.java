package day42_Interface;

public interface ISelfDriving {
	
	void selfDrive(); // public abstract    as a default
	
	public default void methodA() {
		//code
	}
	
	public static void methodB() {
		//code
	}
	

}
