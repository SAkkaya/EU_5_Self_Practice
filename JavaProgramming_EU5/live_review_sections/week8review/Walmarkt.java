package week8review;

public class Walmarkt {

	public static void main(String[] args) {

		Item[] items = { 
				new Item ("Toilet paper ",2 , 100),
				new Item ("cucumber" ,1.59 , 3),
				new Item ("tomatoes ",2 , 500),
				new Item ("Tpotatotes ",3.99 , 5),
				new Item ("shirt ",12.99 , 3),
				new Item ("TV ",200.99 , 1)
		};
		
		double totalPriceBeforeTax=0;
		int largestQuantity =0;
		String nameOfItem = "";
		
		
		for ( Item item : items ) {
			totalPriceBeforeTax+=item.callCost();
			if (item.quantity>largestQuantity) {
				largestQuantity=item.quantity;
				nameOfItem=item.name;
			}
		}
		
		System.out.println("total : $" + totalPriceBeforeTax);
		System.out.println("largest quantity :" + nameOfItem+ " "+ largestQuantity );
	}

}
