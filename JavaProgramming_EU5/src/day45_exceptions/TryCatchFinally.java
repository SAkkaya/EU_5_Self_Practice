package day45_exceptions;

public class TryCatchFinally {

	public static void main(String[] args) {
		
		
		String str = "Selenium";
		
		try {
			System.out.println(str.length()); //8
			System.out.println(str.charAt(100));
		}catch(Exception e) {
			System.out.println("Enter correct index");
			return;          // return olsa bile method ici durur, ama finally bloc calismaya devam eder
		}finally {
			System.out.println("Finally block");
		}
		System.out.println("bye..");

	}

}
