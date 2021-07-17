package day46_excepttion_review;

public class Test_finally_Block {
	
	
	public static void main(String [] args) {

		method1();
		System.out.println("Line after exception - Main");
	}

	public static void method1() {
		method2();
		System.out.println("Line after Exception - method1");
	}

	public static void method2() { //finally method

		try {
			Connection connection = new Connection();
			Connection.open();

			String str = null;
			str.toString();

		}catch(Exception e) {
			System.out.println("Line after Exception - method2");
		
		}finally {
			Connection.close();
		}
		
		System.out.println("-------------------------------- ");
	}
	
	
}
