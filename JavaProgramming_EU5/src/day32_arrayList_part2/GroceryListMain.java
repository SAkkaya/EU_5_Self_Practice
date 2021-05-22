package day32_arrayList_part2;

import java.util.Scanner;

public class GroceryListMain {

	static GroceryList groceryList = new GroceryList();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		boolean quit = false;
		int choice = 0;

		printInstructions();

		while (!quit) {

			System.out.print("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine(); // addItem geliyor sonra Next Line oldugu icin araya bir nextline daha
								// koymalisin

			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				// System.out.println("Printing grocery items");
				groceryList.printGroceryList();
				break;
			case 2:
				// System.out.println("Adding items in the list");
				addItem();
				break;
			case 3:
				// System.out.println("Modifiying items in the list");
				modifyItem();
				break;
			case 4:
				// System.out.println("Removing items in the list");
				removeItem();
				break;
			case 5:
				//System.out.println("Searching items in the list");
				searchItem();
				break;

			case 6:
				quit = true;
				break;
			}

		}

	}

	public static void printInstructions() {

		System.out.println("\nPress"); // write Press , out one down and put a tab
		System.out.println("\t 0 - To print choice options.");
		System.out.println("\t 1 - To print the list of grocery items.");
		System.out.println("\t 2 - To add an item to the list.");
		System.out.println("\t 3 - To modify an item in the list.");
		System.out.println("\t 4 - To remove an item from the list.");
		System.out.println("\t 5 - To search an item from the list.");
		System.out.println("\t 6 - To quit the application.");

	}

	public static void addItem() {
		System.out.println("Enter your grocery item:  ");
		groceryList.addGroceryItem(scanner.nextLine());

	}

	public static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine(); // ==> nextInten sonra nextLine geliyorsa arada nextline ko birtane daha
		System.out.println("Enter replacement item");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo - 1, newItem); // 1 gidigimizde index number arrayList de 0 olacak //set
															// method ile arrays listte

	}

	public static void removeItem() {
		System.out.println("Enter item number");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(itemNo - 1);

	}

	public static void searchItem() {
		System.out.println("Item to search for: ");
		String searchItem = scanner.nextLine();

		if (groceryList.findItem(searchItem) != null) {
			System.out.println("Found " + searchItem + " in your grocery list");
		} else {
			System.out.println(searchItem + "is not in the grocery list");
		}
	}

}
