package day31_arrayList;

import java.util.ArrayList;

public class C1_arrayListIntro {

	public static void main(String[] args) {
		
		//Creating an ArrayList
		
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		//Assigning values to arrayList
		
		names.add("Mike");
		names.add("Smith");
		names.add("John");
		names.add("Emmy");
		names.add("Evan");
		names.add("Mary");
		
		nums.add(99); // adding Object
		nums.add(656);
		nums.add(100);
		nums.add(new Integer ("100")); //also creating object and adding to arraylist
		
		
		//Reading from arrayList
		
		System.out.println(names.get(0));//Mike
		System.out.println(names.get(1));//Smith
		System.out.println(names.get(2));//John
		
		System.out.println("Names count : " + names.size());//Names count : 6
		System.out.println("Nums count : " + nums.size()); //Nums count : 4
		
		System.out.println(names.toString());//[Mike, Smith, John, Emmy, Evan, Mary]
		
		
		
		

	}

}
