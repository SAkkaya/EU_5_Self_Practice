package day42_Interface;

public class Tesla extends ElectricCar{ //1st Concrete Class so need implementation and override

	public Tesla(String model, double price, String color) {
		super(model, price, color);
	
	}

	@Override
	public void start() {
		System.out.println("Tesla is starting quitely...");
		System.out.println("Change to Drive mode...");
	}

	@Override
	public void charge() {
		System.out.println("Tesla charging - plugin to electric outlet...");
	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving ... ");
	}

}
