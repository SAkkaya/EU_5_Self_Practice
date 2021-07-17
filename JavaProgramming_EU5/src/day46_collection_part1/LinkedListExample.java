package day46_collection_part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {

	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(10);  //collection methodu
		list.add(50);
		list.add(500);
		list.add(50000);
		
		System.out.println(list.get(0));  //collection methodu
		System.out.println(list.get(1));
		
		System.out.println(((LinkedList) list).getFirst());
		
		((LinkedList<Integer>) list).addFirst(1);    // bunlar subclass olan LinkedList in methodlari downcasting yapiyoruz.     Parent class List objecgi ile 
		((LinkedList<Integer>) list).addLast(99);
		
		System.out.println(list);  //[1, 10, 50, 500, 50000, 99]
		
		//LinkedList  deyince aklina "Nodes" gelmeli
		
		((LinkedList<Integer>) list).poll();  //  poll ve remove ayni ikisde bastakini remove ediyor
		System.out.println(list); //[10, 50, 500, 50000, 99]
		
		((LinkedList<Integer>) list).remove(); 
		System.out.println(list); //[50, 500, 50000, 99]
		
	
		System.out.println(((LinkedList<Integer>) list).peek());   // en bastakini aldi
		 
		
	//poll da ici bos ise null atiyor  []           ==> remove da ise NoSuch element excepyion aliriz
		
		
	}

}