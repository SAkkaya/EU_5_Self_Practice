package assignment8_methods;

public class Question11 {

	public static void main(String[] args) {

		System.out.println(c_profis(20, 5));

		System.out.println(c_profis(100, 1500));

		System.out.println(c_profis(100, 100));

	}

	public static String c_profis(int buyPrice, int sellPrice) {

		if (sellPrice > buyPrice) {
			return "profit";

		} else if (sellPrice < buyPrice) {
			return "loss";
		} else {
			return "no loss";
		}

	}

}

/*
 * c_profits gets the buyPrice(int) and sellPrice(int) and determines if there
 * was a profit or loss. it returns a string value that can be
 * "profit","loss","no loss"
 * 
 * for example: c_profis(100,1500) returns : "profit"
 * 
 * c_profis(20,5) returns : "loss"
 * 
 * c_profis(100,100) returns : "no loss"
 */