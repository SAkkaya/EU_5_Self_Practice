package day47_collection_part2;

import java.util.*;

public class SetExample {

	public static void main(String[] args) {
	
		Set<Integer> mySet = new HashSet<>(); // Set class ve clas dan object olusturabilirim.
		
		mySet.add(100);
		mySet.add(500);
		mySet.add(800);
		mySet.add(900);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(1000);
		
		System.out.println(mySet.toString());   // there is no duplicate by Set
		System.out.println(mySet.size());
		
		List<String> list = Arrays.asList("23","23","a","a","bb","jj","q","t","t");
		
		Set<String> unique = new HashSet<>(list); // there is no duplicate by Set
		
		System.out.println(list.toString());
		System.out.println(unique.toString());  
		
		
		TreeSet<Integer> tSet  = new TreeSet<>(); // you can sorted , duplicates NOT Allowed, sorting ascending order
		tSet.add(500);
		tSet.add(100);
		tSet.add(10);
		tSet.add(100);
		tSet.add(5);
		tSet.add(8000);
		tSet.add(100);
		tSet.add(100);
		
		System.out.println(tSet.toString());
		
		
		

	}

}