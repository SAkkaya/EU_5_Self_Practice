package day42_Interface;

public class TeslaSemi extends ElectricTruck{ //1st Concrete class ==> so all implementation must be here
	
	
	private double engineSize;

	public TeslaSemi(String model, double price, String color, double engineSize) {
		super(model, price, color);
		this.engineSize = engineSize;
	}

	@Override
	public void load(String item) {
		System.out.println("teslaSemi - load " + item + " by lowering the truck and opening door... ");
	}

	@Override
	public void start() {
		System.out.println("teslaSemi - start by pressing a button... ");
	}

	@Override
	public void charge() {
		System.out.println("teslaSemi - plugin charge for 30 mins... ");
	}

	@Override
	public void drive() {
		System.out.println("teslaSemi - truck is driving with load... ");
	}

	public double getEngineSize() {
		return engineSize;
	}
	
	
	
	
	

	
	
	
	
	
	
}
