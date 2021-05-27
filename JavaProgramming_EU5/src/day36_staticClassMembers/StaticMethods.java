package day36_staticClassMembers;

public class StaticMethods {
	
	static String name = "Apple";
	int age = 10;
	
	
	
	public static void  show1() {
	//	show2(); // u can not call instance method/variable from static method
		show4(); //u can  call static method from static method
		System.out.println(name);// static variable cagirabiliriz static methoddan
	//	System.out.println(age);// instance variable i static methoddan cagiramayiz , hata verir
	}
	
	public void show2() {  //instance method
		show1();  //u can call static from instance method
		
		System.out.println(name);
		System.out.println(age);
	}
	
	public void show3() {
		show2();
		show1();
		
	}
	
	
	public static void show4() {
		
		
		
	}
	
	
	

}
