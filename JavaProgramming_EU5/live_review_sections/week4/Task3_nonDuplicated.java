package week4;

public class Task3_nonDuplicated {

	public static void main(String[] args) {
		/*
		 * Write a program that can return the first non-duplicated character from the
		 * string ex: str = "aaabcccdeeef" output: b
		 */

		String str = "sddffgdfdhhyuıyggs";
		int count = 0;
		char aranan = ' ';
		char arayan = ' ';
		String res = "";

		for (int i = 0; i < str.length(); i++) {
			count = 0;
			aranan = str.charAt(i);

			for (int j = 0; j < str.length(); j++) {
				arayan = str.charAt(j);

				if (aranan == arayan) {
					count++;
					if (count >= 1) {      //s,d
						res += aranan;   //sd
						str = str.replace(arayan, '/');  //   ///ffg/f/hhyuıygg/
					}
				}

			}

		}
		res = res.replace("/", "");
		System.out.println(res);

	}
}