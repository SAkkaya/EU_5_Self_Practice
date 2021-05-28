package week9;

public class ConstructorsPractice {
	
	public void method1() {
		method2();
		System.out.println("A");
	}
	
	public void method2() {
		method1();
		System.out.println("B");
	}

	
}
