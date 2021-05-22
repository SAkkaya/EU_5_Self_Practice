package day31_arrayList;

import java.util.ArrayList;

public class C2_arrayListExample {

	public static void main(String[] args) {

		
		//Languages
		//Print size arrayList
		//read couple of elements
		
		ArrayList<String>  languages= new ArrayList<>(); 
		
		languages.add("german");
		languages.add("english");
		languages.add("turkish");
		languages.add("Java");
		
		//languages.add(true); --boolean kabul etmez data type cunku String array listte
		
		
		System.out.println(languages.get(0));
		System.out.println(languages.get(2));
		
		System.out.println("Number of values: "+ languages.size());//Number of values: 4
		
		
		System.out.println(languages.toString()); //[german, english, turkish, Java]

		languages.add("Russian");
		System.out.println(languages.toString());  //[german, english, turkish, Java, Russian]
		
		
		languages.remove(0);
		System.out.println(languages.toString());//[english, turkish, Java, Russian]
		
		
		System.out.println("Number of values: "+ languages.size()); //Number of values: 4
		
		
	}

}
