package day31_arrayList;

import java.util.ArrayList;

public class C5_shoppingList {

	public static void main(String[] args) {
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		
		shoppingList.add("paper towel");
		shoppingList.add("dish soap");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("golves");
		shoppingList.add("shovel");
		
		//print numbers of items
		
		int count = shoppingList.size();
		System.out.println(count); //6
		
		// print all items in single line
		
		System.out.println(shoppingList.toString());
		
		// print first and last items in single line
		
		System.out.print(shoppingList.get(0)+ "|" + shoppingList.get(count-1)); //int count = shoppingList.size();
		//paper towel|shovel
		
		shoppingList.remove("paper towel");
		shoppingList.remove("shovel");
		
		System.out.println(shoppingList.toString());   //[dish soap, trash bag, clorox, golves]
		System.out.println(shoppingList.get(0));  //dish soap
		
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString()); //[trash bag, clorox, golves]
		
		//print each item
		
		for (String item : shoppingList) {
			System.out.println(item);
			//trash bag
			//clorox
			//golves
		}
		
		//remove all items at once
		shoppingList.clear();
		System.out.println(shoppingList.toString());  //[]
		

	}

}
