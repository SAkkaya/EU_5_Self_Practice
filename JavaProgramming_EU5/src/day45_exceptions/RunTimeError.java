package day45_exceptions;

public class RunTimeError {

	public static void main(String[] args) {
		
		go();

	}

	public static void go() {
		
		System.out.println("going");//going 
		go(); //Exception in thread "main" java.lang.StackOverflowError
	}

	
	
}
