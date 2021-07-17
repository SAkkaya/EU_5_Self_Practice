package day48_collection_part3;

import java.util.*;

import day46_collection_part1.Product;


public class HashSetOfProducts {

	public static void main(String[] args) {
		
		 //Product==> always ClassName  ( baska package icinde oldugu icin import ettik//
//		Set<Product> prodSet = new HashSet<>(); // HashSet =>intanciate order a gore verir
		
		
		Set<Product> prodSet = new TreeSet<>();  //TreeSet +>ascending order a gore veriyor
		
		prodSet.add(new Product("book",25.99));
		prodSet.add(new Product("book", 19.99));
		prodSet.add(new Product("magazine", 7.99));
		
		System.out.println(prodSet.toString());
		
		//print each product by using for each loop
		
		
		//Product here again ClassName
		for(Product p : prodSet) {
			System.out.println(p.getPrice()); //price private oldugu ucun getter methodu ile price i cagirdik yoksa p.price diyebilirdik
		}
		
		//print each product by using forEach method (By LAMBDA Expression)
		
		//prodSet.forEach(p -> System.out.println(p));
		prodSet.forEach(x -> System.out.println(x.getName()));
		
		
		

	}

}
