package week5;

import java.util.Scanner;

public class AssignmentTaskLoginBaris {

	public static void main(String[] args) {
		String expectedUserName = "Cybertek";
		String expectedPasword = "Cybertek123";

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your Cybertek Username");
		String userName = scan.next();

		System.out.println("Enter your Cybertek Pasword");
		String pasword = scan.next();

		int count = 2;
		while (!userName.equals(expectedUserName) || !pasword.equals(expectedPasword)) {
			System.out.println("You have " + count + " chances ");
			System.out.println("invalid pasword");
			System.out.println("Enter your Cybertek Username");
			userName = scan.next();

			System.out.println("Enter your Cybertek Pasword");
			scan.close();
			pasword = scan.next();
			count--;

			if (count == 0 && (!userName.equals(expectedUserName) || !pasword.equals(expectedPasword))) {
				System.out.println("Your account is locked");
				break;
			}
		}

		if (userName.equals(expectedUserName) && pasword.equals(expectedPasword)) {
			System.out.println("logged in");
		}
	}

}