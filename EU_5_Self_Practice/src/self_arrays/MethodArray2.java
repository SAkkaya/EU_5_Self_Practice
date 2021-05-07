package self_arrays;

import java.util.Scanner;


public class MethodArray2 {
	

	public static void main(String[] args) {

		System.out.println(findCar(2, "Honda"));

	}

	public static String[] createArray(int arraySize) {

		Scanner sc = new Scanner(System.in);

		String[] arrayCar = new String[arraySize];

		for (int i = 0; i < arrayCar.length; i++) {
		
			System.out.println("Enter your car name");
			
			arrayCar[i] = sc.next();
		}

		return arrayCar;
	}

	public static boolean findCar(int numberofCar, String carName) {
		
		String[] car= createArray(numberofCar);
		
		boolean flag= false;
		for (int i = 0; i < numberofCar; i++) {
			if (car[i].equalsIgnoreCase(carName)) {
				flag= true;
				break;	
			}
		}
		return flag;
		
//		for (int i = 0; i < numberofCar; i++) {
//			if (car[i].equalsIgnoreCase(carName)) {
//				return true;
//				
//			}
//		}
//		return false;
		
		
	}

}

//createArray method - will accept one parameter which is arraySize
//user will enter some cars

//findcar method - will accept 2 parameters which 1 - int value, toFindCar
//if car is found -return true;
//if not return false
