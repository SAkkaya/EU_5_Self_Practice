package day46_collection_part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingList {

	public static void main(String[] args) {
		
		
		List<String> list = new ArrayList<>();
		list.add("java");
		list.add("js");
		list.add("html");
		list.add("ruby");
		list.add("kotlin");
		list.add("c++");
		
		System.out.println("Before sorting");
		
		//System.out.println(list); // to String siz de calisir ama Arraylerde toString (0 yazman lazim
		System.out.println(list.toString());  //[java, js, html, ruby, kotlin, c++]        
		
		Collections.sort(list);
		
		System.out.println("After sorting");
		System.out.println(list.toString()); ////[c++, html, java, js, kotlin, ruby]
		
		List<Product> prodList = new ArrayList<Product>();  // if you want to save any object you need to put class(here Product Class) that object belongs to it. 
		
	
		
		prodList.add(new Product("spoon", 13.99));
		prodList.add(new Product("bag", 100.00));
		prodList.add(new Product("shoes", 59.99));
		prodList.add(new Product("computer", 2100.59));
		
//		Product p = new Product("table", 81.36);       bu sekilde de eklenebilir yukaridakinin aynisi
//		prodList.add(p);
		
		System.out.println(prodList.toString());         //[Product [name=spoon, price=13.39], Product [name=bag, price=100.0], Product [name=shoes, price=59.99], Product [name=computer, price=2100.99]]

		
		System.out.println("Before sorting");
		System.out.println(prodList.toString());
		
		Collections.sort(prodList); //burada Product  Colection sort ise yaramaz.cunku  birden cok product var. onun icin Product class in icene ==> implements Comparable<Product>       eklememiz gerekir
		                      //public class Product implements Comparable<Product> {   
		
						/* ayrica  bu implenetation methodu yazman gerek kendine gore Product class icinde
		@Override
		public int compareTo(Product anotherProduct) {
			
			if(this.price > anotherProduct.price) {
				return 1;
			}else if(this.price == anotherProduct.price) {
				return 0;
			}else {
				return -1;
			}
			
		}
		
		*/
		
		
		
		System.out.println("After sorting");   
		System.out.println(prodList.toString());
		
		Product p1 = new Product("spoon", 25.34);
		Product p2 = new Product("chair", 7.99);
		System.out.println(p1.compareTo(p2));
		
		
	

	}

}
		
		
		
		
		