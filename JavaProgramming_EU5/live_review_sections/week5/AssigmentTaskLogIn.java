package week5;

import java.util.Scanner;

public class AssigmentTaskLogIn {

	/*
	 * Assignment Task: LogIn:
	 * 
	 * String expectedUserName = "Cybertek"; String expectedPassWord =
	 * "Cybertek123"; 1. Ask user to enter Cybertek username 2. Ask user to enter
	 * Cybertek password 3. if username & password both matches with the expected
	 * username and passwords output: logged in 4. if username || password is not
	 * matched, ask the user to re-enter USER WILL ONLY HAVE 3 chances, after 3rd
	 * attempt if the username || password still invalid: account should be locked
	 */

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		for (int count = 1; count <= 3; count++) {

			System.out.println("Enter username");
			String username = scan.next();
			System.out.println("Enter password");
			String password = scan.next();
			

			boolean correct = username.equalsIgnoreCase("Cybertek") && password.equalsIgnoreCase("Cybertek123");

			if (correct) {
				System.out.println("logged in");
				break;
			} else {

					if (!correct && count < 3) {
						System.out.println("not matched, please re-enter");
						continue;
					} else if (correct && count < 3) {
						System.out.println("logged in");
					} else {
						System.out.println("account is locked");
					}
				}

			}  scan.close();

		}

	}


/*LogIn:

String expectedUserName = "Cybertek";
String expectedPassWord = "Cybertek123";
1. Ask user to enter Cybertek username
2. Ask user to enter Cybertek password
3. if username & password both matches with the expected username and passwords
			output:
					logged in
4. if username || password is not matched, ask the user to re-enter
		USER WILL ONLY HAVE 3 chances, 
		after 3rd attempt if the username || password still invalid:
			account should be locked*/