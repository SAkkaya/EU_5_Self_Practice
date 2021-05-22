package assignment8_methods;

public class Question10 {

	public static void main(String[] args) {
		
		
		System.out.println(isEven(1));
		System.out.println(isEven(4));
		System.out.println(isEven(23));
		

	}

	public static boolean isEven(int num) {
		
		if(num%2==0) {
			return true;
		}else {
			return false;
		}
		
	}

}





/*  isEven method gets a number(int) if its even (2,4,8...) returns true.
if its odd return false.

for example:

isEven(1) --> false

isEven(8) --> true */