package day31_arrayList;

import java.util.ArrayList;

public class C4_cities {

	public static void main(String[] args) {
		
		
		ArrayList<String>cities = new ArrayList<>();
		
		cities.add("London");
		cities.add("Virginia");
		cities.add("DC");
		cities.add("Baku");
		cities.add("Berlin");
		cities.add("Baku");
		
		System.out.println(cities.toString()); //[London, Virginia, DC, Baku, Berlin, Baku]
		
		
		//print each city by using for-each loop seperated by space
		
		
		for(String city : cities) {
			System.out.print(city + " ");    //London Virginia DC Baku Berlin Baku 
	
		}
		System.out.println();
		System.out.println("-------------------------");
		
		//print each city by using for-iterator loop seperated by space
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i) + " ");    //London Virginia DC Baku Berlin Baku 
			
		}
		
		
		System.out.println("Removing Baku");
		cities.remove("Baku");
		cities.remove("New York");
		System.out.println(cities.toString()); //[London, Virginia, DC, Berlin, Baku]
		
		System.out.println("-------------------------");
		cities.add(0,"Arlington");
		cities.add(1,"Istanbul");
		System.out.println(cities.toString());  //[Arlington, Istanbul, London, Virginia, DC, Berlin, Baku]
		
		cities.add(2, "Ankara");
		System.out.println(cities.toString());  //[Arlington, Istanbul, Ankara, London, Virginia, DC, Berlin, Baku]
		

		int idx = cities.indexOf("Istanbul");
		System.out.println(idx); //1
		
		
		System.out.println(cities.indexOf("Bursa")); //-1        // Burasa doesnot exist in array list so gives the -1 result
		
		cities.clear();  //  ==erase all the elelmnts in array
		boolean empty = cities.isEmpty();
		System.out.println(empty); //true
		
	}

}
