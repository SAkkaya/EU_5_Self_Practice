package self_arrays;

public class arraysElement {

	public static void main(String[] args) {
		
		
		
		String[] names = {"Mike", "Smith", "Tom", "Bill"};
		
		char letter=names[3].charAt(0);
		System.out.println(letter);
		System.out.println(names[2].charAt(2));
		
		
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i].length());
		}
		
	}

}
