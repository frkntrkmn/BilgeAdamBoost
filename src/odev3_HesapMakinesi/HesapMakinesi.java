package odev3_HesapMakinesi;

import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);

		while (true) {
			float sonuc = 0;

			System.out.print("sayi giriniz:");
			float sayi = src.nextFloat();

			System.out.println("islem giriniz:\n" + "1_toplama\n" + "2_cikartma\n" + "3_bölme\n" + "4_carpma");
			int islem = src.nextInt();

			System.out.print("sayi giriniz:");
			float sayi2 = src.nextFloat();

			if (islem == 1) {
				sonuc = sayi + sayi2;
			} else if (islem == 2) {
				sonuc = sayi - sayi2;
			} else if (islem == 3) {
				sonuc = sayi / sayi2;
			} else if (islem == 4) {
				sonuc = sayi * sayi2;
			} else
				System.err.println("hatali islem sectiniz...");

			System.out.println("\nisleminizin sonucu: " + sonuc + "\n");

		}
	}

}
