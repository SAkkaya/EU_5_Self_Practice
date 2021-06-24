package day42_Interface;

public class TeslaTruck extends TeslaSemi{ // 2nd level Concrete  class you dont need to override it

	public TeslaTruck(String model, double price, String color, double engineSize) {
		super(model, price, color, engineSize);
		
	}
	
	//ISTERSEK ONCEKI ABSTARC METODLARI BURDA OVERRIDE EDEBILIRIZ

//	@Override
//	public void load(String item) {
//		super.load(item);
//	}
//
//	@Override
//	public void start() {
//		super.start();
//	}
//
//	@Override
//	public void charge() {
//		super.charge();
//	}
//
//	@Override
//	public void drive() {
//		super.drive();
//	}
//
//	@Override
//	public double getEngineSize() {
//		return super.getEngineSize();
//	}
	
	
	
	

}
