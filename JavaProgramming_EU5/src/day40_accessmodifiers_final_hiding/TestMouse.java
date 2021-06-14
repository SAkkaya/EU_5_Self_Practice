package day40_accessmodifiers_final_hiding;

public class TestMouse {

	public static void main(String[] args) {
		
		Mouse mouse = new Mouse();
		mouse.getRodentDetails(); //parentTail: 4
		
		mouse.getMouseDetails(); //tail : 8, parentTail : 8
		
		mouse.getMouseDetails1(); //tail : 8, parentTail : 4  // parent i aldi super.tailgate methodun icine ekleyerek

	}

}
