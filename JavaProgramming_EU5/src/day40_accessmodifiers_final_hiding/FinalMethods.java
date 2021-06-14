package day40_accessmodifiers_final_hiding;

public class FinalMethods {   //public final class FinalMethods {  final class olsa idi  asagida inherit edemezdik 
	
	public final void method1() {  // if methods are final you cannot Override it
		System.out.println("Method-1");
	}
	
	
	public static final void staticMethod(String word) {// if methods are final you cannot Override it
		System.out.println("Static Method"); 
	}

}



class Sub extends FinalMethods{  //public final class FinalMethods yukarda olsa idi inherit edemezdik burda
	
	/*   //you cannot override final method
	public void method1() {
		System.out.println("Method-1 in sub class");
	}
	*/
	
	/*
	public static void staticMethod(String w) {  // yukari final oldugu icin kabul etmiyor
		System.out.println("Static method in sub class");
	}
	*/
	
	
	
}