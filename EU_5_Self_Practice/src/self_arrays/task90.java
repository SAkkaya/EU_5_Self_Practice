package self_arrays;

public class task90 {

	public static void main(String[] args) {

		String[] carArray = new String[6];
		carArray[0] = "Honda";
		carArray[1] = "Toyota";
		carArray[2] = "Nissan";
		carArray[3] = "BMW";
		carArray[4] = "Mercedes";
		carArray[5] = "Porsche";

		String search = "Mercedess";
		
		boolean output =true;

		for (int i = 0; i < carArray.length; i++) {
			
			if (carArray[i].equalsIgnoreCase(search) ) {
				output=true;
				break;
			}else {
				output=false;
			}

		}

		if (output == true) {

			System.out.println("I found your car " + search + " in this array");

		} else {
			System.out.println("I could not find your car " + search + " in this array");
			
		}
	}

}
