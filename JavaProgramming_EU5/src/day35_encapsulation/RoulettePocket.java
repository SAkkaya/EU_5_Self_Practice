package day35_encapsulation;

public class RoulettePocket {

	public int pocketNumber;

	private String[] pocketColor;

	
	private void setpocketColors() {

		pocketColor = new String[37];

		pocketColor[0] = "green";

		for (int i = 1; i <= 10; i++) {

			if (i % 2 == 0) {
				pocketColor[i] = "black";
				pocketColor[i + 18] = "black";
			} else {
				pocketColor[i] = "red";
				pocketColor[i + 18] = "red";
			}

		}

		for (int i = 11; i <= 18; i++) {

			if (i % 2 == 1) {
				pocketColor[i] = "black";
				pocketColor[i + 18] = "black";
			} else {
				pocketColor[i] = "red";
				pocketColor[i + 18] = "red";
			}

		}

	}

	public RoulettePocket(int a) { //(int a= int pocketNumber)

		if (a > 36 || a < 0) {
			System.out.println("Invalid Number");
			System.exit(0);

		} else {
			pocketNumber = a;   //this.pocketNumber = pocketNumber;
			setpocketColors();
		}

	}

	
	public String getPocketColor() {

		return pocketColor[pocketNumber];
	}

}


/*Roulette Wheel Colors

On a roulette wheel, the pockets are numbered from 0 to 36. The colours of the pockets are as follows:

Pocket 0 is green.
For pockets 1 through 10, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 11 through 18, the odd-numbered pockets are black and the even-numbered pockets are red.
For pockets 19 through 28, the odd-numbered pockets are red and the even-numbered pockets are black.
For pockets 29 through 36, the odd-numbered pockets are black and the even-numbered pockets are red.

Write a class named RoulettePocket. The class's constructor should accept a pocket number. The class should have a method named getPocketColor that returns the pocket's color, as a string.

Demonstrate the class in a program that asks the user to enter a pocket number, and displays whether the pocket is green, red, or black. The program should display an error message if the user enters a number that is outside the range of 0 and 36.

*/