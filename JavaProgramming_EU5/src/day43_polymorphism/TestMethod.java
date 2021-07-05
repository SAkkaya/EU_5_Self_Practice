package day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		
		ChildA chA = new ChildA();
		
		chA.m1(); //extends from Parent class
		chA.m2(); // override from Interface 
		chA.m3();  // belongs to ChildA Class
		
		
		ChildB chB = new ChildB();
		
		chB.m1();  //extends from Parent class
		chB.m2();   // override from Interface 
		chB.m4();   // belongs to ChildB Class
		
		
		Parent p1 = new ChildA();   //Poly ==> referance type is Parent, object type is Child
		p1.m1();   //Always ACCESS to REFERENCE TYPE
		
		Parent p2 = new ChildB();
		p2.m1(); // refernece type is the same Parent 
		
		MyInterface int1 = new ChildA();
		int1.m2(); // Left Side(Reference Type) Interface  right side new Objcet is Child Class; so polymorphisim 
					// There is a relationship, child class imoplementing MyInterface 
						// overriding m2()
		
			//	int1.m3();     //Reference type decides on Acccess (There is no m3() in MyInterface
		
		MyInterface int2 = new ChildB();
		int2.m2();  // Only reference types decides so only Interface dicide on ACCESS
		
	}

}



class Parent{
	public void m1() {}
}


interface MyInterface{
	void m2();
}


class ChildA extends Parent implements MyInterface{

	@Override
	public void m2() {}
	public void m3() {}
}
	
	
class ChildB extends Parent implements MyInterface{

	@Override
	public void m2() {}
	public void m4() {}
	

}
	
	









