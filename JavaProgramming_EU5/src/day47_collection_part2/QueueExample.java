package day47_collection_part2;


import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {  // Nodelar mantigi ayni LInkedList gibi 

	public static void main(String[] args) {
		
		
	//	Collection<String> queue = new LinkedList<>(); // FIFO - > (First in First out)      => bu da olurdu Colection ustteki Interface Quesden 
		Queue<String> queue = new LinkedList<>(); // FIFO - > (First in First out)
		 
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Jamal");
		queue.add("Asiya");
		
		System.out.println(queue.toString());     // to string olmazsa da olur listelerde
		
		String name = queue.remove(); // ilk elemani siler queue deki(kuyriktaki)
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//removing an element from Queue using poll()
		//the poll() method is similar to remove() except that it returns null if the queue is empty
		
		name = queue.poll();       // poll() bu methodlar Colection da yok         // ilk elemani siler queue deki(kuyriktaki) remove () ile ayni
		System.out.println(name); 
		
		System.out.println(queue.toString());
		
		//get the element at the front of the queue without removing it using peek()
		name = queue.peek(); // en bastakini giosteriyor
		System.out.println(name);
		System.out.println(queue.toString());
		

	}

}