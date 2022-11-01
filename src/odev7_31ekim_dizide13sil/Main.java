package odev7_31ekim_dizide13sil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int toplam = 0, sayi;

		System.out.println("dizi uzunluğu giriniz:");
		int uzunluk = src.nextInt();

		// uzunluğu alınan dizinin içerisine aşağıda elemanlarını ekledik.
		int dizi[] = new int[uzunluk];
		for (int i = 0; i < dizi.length; i++) {
			System.out.print(i + ". indisi giriniz:");
			sayi = src.nextInt();
			dizi[i] = sayi;
		}

		int j = 0;
		int ilkIndex[] = new int[1];
		ilkIndex[0] = dizi[0];

		for (int i = 0; i < dizi.length;) {

			while (j == 0) {
				if (ilkIndex[j] == 13) {

					i += 2;

					j++;
				} else if (ilkIndex[j] != 13) {

					toplam += dizi[0];

					i++;

					j++;
				}
			}

			if (dizi[i] == 13 || dizi[i - 1] == 13) {
				i++;
			} else {
				toplam += dizi[i];
				i++;
			}

		}

		System.out.println(toplam);
	}

}