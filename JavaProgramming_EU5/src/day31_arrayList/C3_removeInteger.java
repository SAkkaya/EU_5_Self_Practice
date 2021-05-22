package day31_arrayList;

import java.util.ArrayList;

public class C3_removeInteger {

	public static void main(String[] args) {

		ArrayList<Integer> nums = new ArrayList<>();
		
		System.out.println(nums.size()); //0
		System.out.println(nums.isEmpty()); //true
		System.out.println(nums.size()==0); //true
		
		nums.add(4);
		nums.add(1);
		nums.add(44);
		nums.add(5);
		nums.add(10);
		nums.add(100);
		nums.add(55);
		
		System.out.println(nums.toString()); //[4, 1, 44, 5, 10, 100, 55]
		
		nums.remove(5);  // removes the specified index number from the list
		System.out.println(nums.toString()); //[4, 1, 44, 5, 10, 55]
		
		
		Integer n1= new Integer(5); // Converting primitive to Object--> create object  ==> valueOf ile ayni
		Integer n2 = Integer.valueOf(1); // create object 
		
		nums.remove(n1); // // removes the specified element from the list
		System.out.println(nums.toString()); //[4, 1, 44, 10, 55]
		
		nums.remove(n2);
		System.out.println(nums.toString()); //[4,44, 10, 55]
		
		nums.remove(new Integer(4)); // removes the specified element from the list
		System.out.println(nums.toString());//[44, 10, 55]
		
		
		
		
		
	}

}
