package week8review;

public class CarpetShop {

	public static void main(String[] args) {

		Carpet carpet1Price= new Carpet(2,4,50,true);
		
		System.out.println(carpet1Price.calcCost());
		
		
		System.out.println("-----------------------------------");
		
		Carpet[] carpetPrices= {new Carpet(2,4,50,true),
				new Carpet(3,6,60,false),
				new Carpet(2,4,50,true),
			
		};
		
		for (Carpet each : carpetPrices) {
			System.out.println(each.calcCost());
		}
		
	}

}
