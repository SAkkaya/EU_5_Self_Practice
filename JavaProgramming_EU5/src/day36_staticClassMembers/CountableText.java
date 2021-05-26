package day36_staticClassMembers;

public class CountableText {

	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); //1
		Countable obj2 = new Countable(); //1  belongs to object whenever call call the object instance variable
		Countable obj3 = new Countable();  //1
/*		
		objectCount = obj1.getInstanceCount();  //1
		objectCount = obj2.getInstanceCount(); //1
		
		
		System.out.println(objectCount);  //3
*/
		System.out.println(Countable.instanceCount);
		
	}
	
	
}
