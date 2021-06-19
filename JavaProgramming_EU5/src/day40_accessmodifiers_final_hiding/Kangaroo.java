package day40_accessmodifiers_final_hiding;

public class Kangaroo extends Marsupial{
	/*
	@Override
	public boolean isBiped() {
		return true;
	}
	*/
	
	public static boolean isBiped() { // parent should be static as well, if child is static
		return true;      
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs:"+ isBiped());
	}

}
