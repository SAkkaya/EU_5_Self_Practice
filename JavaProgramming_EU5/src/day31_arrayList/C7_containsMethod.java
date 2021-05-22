package day31_arrayList;

import java.util.ArrayList;

public class C7_containsMethod {

	public static void main(String[] args) {
		
		ArrayList<String>list1 = new ArrayList<>();		
 		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");

		
		System.out.println(list1.toString()); //[Jan, Feb, Mar, Apr, May]

		ArrayList<String> list2=list1; //=> list bir de degisiklik yaparsan list 2 de de degisir 
		//System.out.println(list2.toString()); //[Jan, Feb, Mar, Apr, May]
		
		// copy all values from list1
		
		ArrayList<String> months = new ArrayList<String>(list1); // burda ise list 1 i list ikiye kopyaliyoruz
		
		//System.out.println(months); //[Jan, Feb, Mar, Apr, May]
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months); //[Jan, Feb, Mar, Apr, May, Jun, July, Aug]
		
		System.out.println(months.contains("Jan")); // true
		System.out.println(months.contains("Dec")); // false
		
		
		//how to check if Feb is in second position
		
		System.out.println(months.indexOf("Feb")==1); //true
		System.out.println(months.get(1).equals("Feb")); //true
		
		list1.add("Jan");
		System.out.println("List1 : " + list1); //List1 : [Jan, Feb, Mar, Apr, May, Jan]
		System.out.println("Months : " + months); //Months : [Jan, Feb, Mar, Apr, May, Jun, July, Aug]
		
		if (months.containsAll(list1)) {
			System.out.println("Months has all list1"); //Months has all list1
		} else {
			System.out.println("some values are missing");
		}
		
		
		
		

	}

}
