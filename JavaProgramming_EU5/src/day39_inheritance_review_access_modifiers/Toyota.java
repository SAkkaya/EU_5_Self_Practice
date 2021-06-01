package day39_inheritance_review_access_modifiers;

public class Toyota extends Car{
	
	private int roadService; // instance variables

	public Toyota(int roadService) { //public Toyota(String name, String size, int wheels, int doors, int gears, boolean isManual, int roadService
		super("Toyota", "4WD", 4, 4, 6, false);  ///hard coded oldugu icin asagida bunlara ihtiyac yok
		this.roadService = roadService;
	}

	public void accelerate (int rate) {
		
		int newVelocity = getCurrentVelocity()+rate;  // private oldugu icin cuurentvelocity
		//int newVelocity==> local variables
		
		if (newVelocity==0) {
			stop();
			changeGear(0);
		}else if(newVelocity>0 && newVelocity<=10) {
			changeGear(1);
		}else if(newVelocity>10 && newVelocity<=20) {
			changeGear(2);
		}else if(newVelocity>20 && newVelocity<=30) {
			changeGear(3);
		}else {
			changeGear(4);
		}
		
		
		
		if (newVelocity>0) {
			changeVelocity(newVelocity, getCurrentDirection());
		}
		
	}
	

}
