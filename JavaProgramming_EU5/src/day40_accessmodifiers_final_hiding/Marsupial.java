package day40_accessmodifiers_final_hiding;

public class Marsupial {
	
//	public boolean isBiped() {
//		return false;
//	}
	

	public static boolean isBiped() {  // method hiding static oldugu icin 
		return false;					// hiding yapacak child deki methodu ve bu sefer false verecek override olmayacagi icin
	}

	
	
	public void getMarsupialDescription() {
		System.out.println("Marsupial walks on the two legs :" + isBiped());
	}

}
