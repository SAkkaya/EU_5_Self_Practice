package day42_Interface;

public class Tesla2 extends Vehicle implements IElectric, ISelfDriving{

	@Override
	public void selfDrive() {	
		
	}

	@Override
	public void charge() {
	}

	@Override
	public void charge2() {
	}

	@Override
	public void methodA() {
		IElectric.super.methodA();
	} 



}
