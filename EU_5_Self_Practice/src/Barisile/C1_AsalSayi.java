package Barisile;

import java.util.Scanner;

public class C1_AsalSayi {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
	
		System.out.println("pozitif tam sayi girin");

		double sayi = scan.nextDouble();
		if (Math.round(sayi)!=sayi) {
			System.err.println("girdiginiz sayi ondalikli sayidir, lutfen tam sayi giriniz");
		}
		
			if (Math.round(sayi) == sayi) {

			if (sayi <= 1) {
				System.out.println("girdiginiz sayi asal sayi degildir");
			}

			if (sayi == 2) {
				System.out.println(sayi + "sayisi asal sayidir");

				// asal kendine ve 1 e tam bolunebilen sayi
			}

			double kalan = 0;
			int count = 0;

			if (sayi > 3) {

				for (int i = 2; i < sayi; i++) {

					kalan = sayi % i;

					if (kalan == 0) {

						count++;

					} else if (kalan != 0) {

					}
				}

			} // System.out.println(count);

			if (count == 0) {
				System.out.println((int) sayi + " asal sayidir");
			} else {
				System.out.println((int) sayi + " asal sayi degildir");
			}

		}
			scan.close();	
	} 

}
