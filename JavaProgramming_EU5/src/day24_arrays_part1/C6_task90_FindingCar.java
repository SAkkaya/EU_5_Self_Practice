package day24_arrays_part1;

public class C6_task90_FindingCar {

	public static void main(String[] args) {

		String[] car = { "Toyota", "Nissan", "BMW", "Mercedes", "Honda" };

		boolean flag = false;

		for (int i = 0; i < car.length; i++) {

			if (car[i].equals("Honda")) {
				flag = true; // flag false idi true oldu
				break;
			}

		}

		if (flag) { // flag =true olmustu bir yukarda
			System.out.println("Found it!");
		} else {
			System.out.println("Not found it!");
		}

	}

}

/*
 * ØCreate a car array that holds 6 car names inside ØCheck if your array has
 * the car name “Honda” ØIf it is , print “ I found your car Honda in this
 * array” ØIf it is not, print “ I could not find your car Honda in this array”
 */
