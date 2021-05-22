package day32_arrayList_part2;

import java.util.ArrayList;

public class C1_removeAll {

	public static void main(String[] args) {
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(30);list1.add(12);list1.add(22);

		ArrayList<Integer>list2 = new ArrayList<Integer>();
		list2.add(30);list2.add(345);list2.add(1);list2.add(12);list2.add(22);list2.add(12);
		
		System.out.println(list1); //[30, 12, 22]
		System.out.println(list2);//[30, 345, 1, 12, 22, 12]

		
		//removes all matching values from list1;
		list2.removeAll(list1);
		System.out.println(list2); //[345, 1]

		
		
		
		
		
	}

}
