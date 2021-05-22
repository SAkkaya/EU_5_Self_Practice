package assignment8_methods;

public class Question14 {

	public static void main(String[] args) {
		System.out.println(threeLocks(false,false, true)); //true
		System.out.println(threeLocks(true,false, false)); //false
		System.out.println(threeLocks(true,true, true)); //true

	}

	public static boolean threeLocks(boolean a, boolean b, boolean c) {
		
		if((a==true&&b==true) || c==true) {
			return true;
		}else {
			return false;
		}
		
	}

}


/*This one is about truth table logic, threeLocks gets 3 booleans and returns a boolean.

It returns true only if both a and b are true or c is true.*/