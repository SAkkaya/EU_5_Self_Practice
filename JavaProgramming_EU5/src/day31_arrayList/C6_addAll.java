package day31_arrayList;

import java.util.ArrayList;

public class C6_addAll {

	public static void main(String[] args) {
		
		ArrayList<String> l1 = new ArrayList<>();
		
		l1.add("Java");
		l1.add("JS");
		
		ArrayList<String> l2 = new ArrayList<>();
		
		l2.add("C#");
		l2.add("C++");
		
		System.out.println(l1.toString());//[Java, JS]
		System.out.println(l2.toString()); //[C#, C++]
		
		l2.addAll(l1);
		System.out.println(l2.toString());  //[C#, C++, Java, JS]
		//System.out.println(l2); //[C#, C++, Java, JS]
		
		
		l1.addAll(l2);
		System.out.println(l1); //[Java, JS, C#, C++, Java, JS]
		
	//	String [] numbers = { "apple", "Orange"};
	//			l2.addAll(numbers); //The method addAll(Collection<? extends String>) in the type ArrayList<String> 
									// is not applicable for the arguments (String[])
		
		

	}

}
