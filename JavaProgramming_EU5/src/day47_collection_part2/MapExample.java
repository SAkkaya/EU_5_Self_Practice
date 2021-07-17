package day47_collection_part2;

import java.util.*;


public class MapExample {

	public static void main(String[] args) {
		
		List<Integer> items2 = new ArrayList<>();
		items2.add(10);
	//	System.out.println(items2.get(0));// 10
		
		 //(Product, Price)
		Map<String, Double> items = new HashMap<>();
		items.put("Apple", 3.49);
		items.put("Flowers", 10.99);
		items.put("Eggs", 4.99);
		items.put("Milk", 6.0);
		items.put("Cherries", 4.99);
		items.put("Apple", 5.49);
		
		System.out.println(items.size());
		
		System.out.println(items.toString());
		
		System.out.println(items.isEmpty());
		
		System.out.println(items.get("Apple"));
		System.out.println(items.get("Milk"));
		
		items.remove("Flowers");
		
		System.out.println(items.toString());
		
		System.out.println("Is Apples there? " + items.containsKey("Apple"));
		System.out.println("Is Flowers there?" + items.containsKey("Flowers"));
		
		items.replace("Eggs", 3.5);    // put  da replace ile aynisini yapiyor
		System.out.println("Price of Eggs: " + items.get("Eggs"));
		
		items.put("Milk", 2.6); // 2   dersek hata verir cunku Double => Wrapper class olarak yani Object burdaki
		System.out.println("Price of Milk: " + items.get("Milk"));
		
		//increase price of cherries by $2
		items.replace("Cherries", items.get("Cherries")+2);
		System.out.println("Price of Cherries: " + items.get("Cherries"));
		
		
		

	}

}