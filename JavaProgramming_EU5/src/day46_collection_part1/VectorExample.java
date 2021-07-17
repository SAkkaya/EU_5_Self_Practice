package day46_collection_part1;

import java.util.List;
import java.util.Vector;

public class VectorExample {  // Vector Class concrete class oldugu icin ustundeki Interfacelerin methodunu impleme etmek zorunda., kendine ait methodu yok

	public static void main(String[] args) {
		
		List<String> v = new Vector<>();
		v.add("water");
		v.add("tea");
		v.add("green tea");
		
		for(String str : v) {
			System.out.println(str);
		}
		
		System.out.println(v.size());
		
		System.out.println(v.get(2));

	}

}