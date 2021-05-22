package day26_arrays_part3;

import java.util.Random;

public class C5_task94PaswordCreate_Baris {

	public static void main(String[] args) {

		String str = mergePasword();
		System.out.println(str);

	}

	private static String createPasword() {
		Random rand = new Random();
		String pas = "";
		for (int i = 0; i < 6; i++) {
			char a = (char) (rand.nextInt(92) + 33);
			pas = pas + a;

		}
		return "xxx" + pas + "xxx";         

	}

	public static String mergePasword() {
		 
		return createPasword().split("xxx")[1].concat(createPasword().split("xxx")[1]);

	}

}