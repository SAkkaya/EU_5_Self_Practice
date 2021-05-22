package day9_controlFlowStatements3;

public class C1_Task37_LaptopModels {

	public static void main(String[] args) {
		/*
		 * Write a program that lets user to enter apple,dell,acer laptop models If it
		 * is apple show “Apple-no virus” If it is dell show “Tough one” If it is acer
		 * show “Not recommended” Else “do not buy that one!”
		 */

		String model = "acer";

		switch (model) {

		case "apple":
			System.out.println("Apple-no virus");
			break;

		case "dell":
			System.out.println("Tough one");
			break;
		case "acer ":
			System.out.println("Not recommended");
			break;

		default:
			System.out.println("do not buy that one!");
			// break; // default sonda ise break kullansa da kullanmasanda fark etmez en
			// sonda zaten

		}

	}

}
