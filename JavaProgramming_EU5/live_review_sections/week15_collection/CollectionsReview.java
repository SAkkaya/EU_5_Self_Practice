package week15_collection;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;
import java.util.TreeSet;
import java.util.Vector;

public class CollectionsReview {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<>();
		//list.pop();
		
		Vector<Integer> list2 = new Vector<>();
		//list2.pop();
		
		
		Stack<Integer> list3 = new Stack<>();
		list3.addAll( Arrays.asList(1,2,3,4,5,6,7,8) );
		
		System.out.println(list3);      //[1, 2, 3, 4, 5, 6, 7, 8]
		
		//int r = list3.peek();// returns the last object from stack, does not remove
		int r = list3.pop();  // hem son elemani aliyor hem de  remove ediyor
		
		System.out.println(list3); //[1, 2, 3, 4, 5, 6, 7]
		
		System.out.println(r); //8
		
		
		HashSet<Integer> numbers = new HashSet<>();
		numbers.addAll( Arrays.asList(2,2,2,3,3,3,4,4,5,5,5,13,3,3,4,4,5, 99, null)); // order is random       
		
		System.out.println(numbers);  //  [null, 2, 3, 99, 4, 5, 13]
		
		LinkedHashSet<String> characters= new LinkedHashSet<>();
		characters.addAll(  Arrays.asList("D", "D", "A", "A", "B", "B", "A", "C", null)); // keeps the insertion order      
		
		System.out.println(characters);  //  [D, A, B, C, null]
		
		
		LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
		numbers2.addAll( Arrays.asList(2,2,2,3,3,3,4,4,5,5,5,13,3,3,4,4,5, 99, null)); // keeps the insertion order
		
		System.out.println(numbers2); //[2, 3, 4, 5, 13, 99, null]
		
		

		TreeSet<String> characters2= new TreeSet<>();
		characters2.addAll(  Arrays.asList("D", "D", "A", "A", "B", "B", "A", "C")); // sorted order            ( ascending order)
		
		System.out.println(characters2);  //[A, B, C, D]
		
		System.out.println("------------------------------------------------");
		
		Queue<Integer>  queue1 = new PriorityQueue<>();
		
		
		
		
		
		
	}
	
	
	public synchronized void method() {
		
	}
	

}
