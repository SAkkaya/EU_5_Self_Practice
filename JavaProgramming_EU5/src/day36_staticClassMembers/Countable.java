package day36_staticClassMembers;

public class Countable {

//	int instanceCount; //  instance variable    default value =0
	static int instanceCount; //  static variable    

	public Countable() {
		
		 instanceCount++;
	}
	
	public int getInstanceCount() {   
		return instanceCount;
	}
	
	
	
	
}
