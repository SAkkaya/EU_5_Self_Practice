package day40_accessmodifiers_final_hiding;

public class CarTest {

	public static void main(String[] args) {
		
		Car c = new Car();
		
		c.model="M3";
		c.year=2017;
		//c.door=4; private
		c.engine=5.3;
		
		//System.out.println(c);//day40_accessmodifiers_final_hiding.Car@15db9742
		//System.out.println(c.toString()); //day40_accessmodifiers_final_hiding.Car@15db9742
					// if you do not override it it will give you reference adress of it 
		
		// Car Class a @Override   toString generate ettikten sonra
		System.out.println((c.toString()));
		//Car [model=M3, year=2017, door=0, engine=5.3]
	}

}
