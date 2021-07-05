package day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();  //NO ACCESS    gives ERROR
	//	mac.code(); // not available  because reference type AppleDevice da code method yok ve overriden edilmis degil
		

		Mac myMac = new Mac();
		myMac.use();     //   ==> Both of them perfectly fine, because  belongs to Mac class
		myMac.code();  //   ==> Both of them belongs to Mac class, my object belongs to Object (Mac class)
		
		
		AppleDevice watch  = new AppleWatch();
		watch.use();
			
			
			
			
	}

}
