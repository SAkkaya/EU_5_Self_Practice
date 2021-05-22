package day16__classObejcts;

public class C7_CarObjects {

	public static void main(String[] args) {

		C2_Car car1 = new C2_Car();
		
		car1.printCarInfo();  //  default values ==>Car make[null],model[null],color[null],current speed[0]
		
		car1.make="Ford";
		car1.model="Fiesta";
		car1.color="Grey";
		car1.currentSpeed=55;
		
		car1.printCarInfo();      //  Car make[Ford],model[Fiesta],color[Grey],current speed[55]
		
		car1.showCurrentSpeed(70); // Ford is driving at 55 mph,following the speed limit-70
		
		car1.drive();  //Ford Fiesta is driving...
		
		System.out.println("before: " + car1.currentSpeed);  // before: 55
		 
		car1.accelerate(20); //currentSpeed = currentSpeed + mph;   ==> bunu yapacak bu method ile 
		
		System.out.println("after : " + car1.currentSpeed);  //after : 75
		
		

	}

}
